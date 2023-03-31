package com.einfo.task.modle;

import javax.annotation.processing.Generated;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class movie_booking {
	
	@Id
	private String m_id;
	private String m_mobile_no;
	private String m_name;
	private String m_date;
	private String m_time;
	private String m_ticket_type;
	private String m_no_ticket;
	private String m_payment_type;
	private String m_Transaction;
	
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_mobile_no() {
		return m_mobile_no;
	}
	public void setM_mobile_no(String m_mobile_no) {
		this.m_mobile_no = m_mobile_no;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public String getM_date() {
		return m_date;
	}
	public void setM_date(String m_date) {
		this.m_date = m_date;
	}
	public String getM_time() {
		return m_time;
	}
	public void setM_time(String m_time) {
		this.m_time = m_time;
	}
	public String getM_ticket_type() {
		return m_ticket_type;
	}
	public void setM_ticket_type(String m_ticket_type) {
		this.m_ticket_type = m_ticket_type;
	}
	public String getM_no_ticket() {
		return m_no_ticket;
	}
	public void setM_no_ticket(String m_no_ticket) {
		this.m_no_ticket = m_no_ticket;
	}
	public String getM_payment_type() {
		return m_payment_type;
	}
	public void setM_payment_type(String m_payment_type) {
		this.m_payment_type = m_payment_type;
	}
	public String getM_Transaction() {
		return m_Transaction;
	}
	public void setM_Transaction(String m_Transaction) {
		this.m_Transaction = m_Transaction;
	}
	public movie_booking(String m_mobile_no, String m_name, String m_date, String m_time, String m_ticket_type,
			String m_no_ticket, String m_payment_type, String m_Transaction) {
		super();
		this.m_mobile_no = m_mobile_no;
		this.m_name = m_name;
		this.m_date = m_date;
		this.m_time = m_time;
		this.m_ticket_type = m_ticket_type;
		this.m_no_ticket = m_no_ticket;
		this.m_payment_type = m_payment_type;
		this.m_Transaction = m_Transaction;
	}
	public movie_booking(String m_id,String m_mobile_no, String m_name, String m_date, String m_time, String m_ticket_type,
			String m_no_ticket, String m_payment_type, String m_Transaction) {
		super();
		this.m_id = m_id;
		this.m_mobile_no = m_mobile_no;
		this.m_name = m_name;
		this.m_date = m_date;
		this.m_time = m_time;
		this.m_ticket_type = m_ticket_type;
		this.m_no_ticket = m_no_ticket;
		this.m_payment_type = m_payment_type;
		this.m_Transaction = m_Transaction;
	}
	public movie_booking() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "movie_booking [m_mobile_no=" + m_mobile_no + ", m_name=" + m_name + ", m_date=" + m_date + ", m_time="
				+ m_time + ", m_ticket_type=" + m_ticket_type + ", m_no_ticket=" + m_no_ticket + ", m_payment_type="
				+ m_payment_type + ", m_Transaction=" + m_Transaction + "]";
	}
	
	
	
}
