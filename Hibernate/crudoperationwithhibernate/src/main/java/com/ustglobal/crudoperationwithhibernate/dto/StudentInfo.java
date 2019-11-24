package com.ustglobal.crudoperationwithhibernate.dto;

import javax.persistence.*;

@Entity
@Table(name="student")
public class StudentInfo {

	@Id
	@Column
	private int sid;
	@Column
	private String sname;
	@Column
	private String date_of_birth;

	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	
}
