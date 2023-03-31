package com.einfo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.einfo.test.modle.member;
import com.einfo.test.repo.memberRepo;

@SpringBootTest
@AutoConfigureMockMvc
class TestApplicationTests {

	@Autowired
	MockMvc mm;
	
	@MockBean
	memberRepo mr;
	
	@Test
	void contextLoads() throws Exception {
		mm.perform(MockMvcRequestBuilders.get("/home"))
        .andExpect(status().isOk());	
		}
	
	@Test
	public void testrepo() throws Exception{
		when(mr.getmemberbyemail("aks@gmail.com")).thenReturn(new member("aks@gmail.com","akshat","9988","m"));
	}

}
