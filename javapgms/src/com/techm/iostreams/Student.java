package com.techm.iostreams;

import java.io.Serializable;

public class Student implements Serializable {
	
	private int stid;
	private String stname;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public Student(int stid, String stname) {
		super();
		this.stid = stid;
		this.stname = stname;
	}
	@Override
	public String toString() {
		return "Student [stid=" + stid + ", stname=" + stname + "]";
	}
	
	

}
