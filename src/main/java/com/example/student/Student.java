package com.example.student;

public class Student {

	Integer id;
	String fname;
	String lname;
	String email;
	Long phoneNO;
	
	public Student() {
		super();
	}
	
	
	
	public Student(String fname, String lname, String email, Long phoneNO) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNO = phoneNO;
	}



	public Student(Integer id, String fname, String lname, String email, Long phoneNO) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNO = phoneNO;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getPhoneNO() {
		return phoneNO;
	}
	public void setPhoneNO(Long phoneNO) {
		this.phoneNO = phoneNO;
	}
	
	
	
	

}
