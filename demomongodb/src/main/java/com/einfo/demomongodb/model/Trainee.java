package com.einfo.demomongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Trainee {

	@Id
	private int tid;
	private String traineeName;
	private String location;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Trainee(int tid, String traineeName, String location) {
		super();
		this.tid = tid;
		this.traineeName = traineeName;
		this.location = location;
	}
	public Trainee() {
		super();
	}
	@Override
	public String toString() {
		return "Trainee [tid=" + tid + ", traineeName=" + traineeName + ", location=" + location + "]";
	}
	
}
