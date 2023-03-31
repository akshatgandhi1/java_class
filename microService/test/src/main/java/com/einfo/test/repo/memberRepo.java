package com.einfo.test.repo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.einfo.test.modle.member;

@Repository
public interface memberRepo {

	public default List<member>  getmembers(){
		List<member> li=new ArrayList<member>();
		li.add(new member("aks@gmail.com","akshat","9988","m"));
		return li;
	}
	public default member getmemberbyemail(String email) {
	return new member("aks@gmail.com","akshat","9988","m");	
	}
}
