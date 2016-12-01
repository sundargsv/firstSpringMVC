package com.sundar.models;

import java.util.ArrayList;
import java.util.Date;

import javax.validation.constraints.*;

import com.sundar.customValidators.IsValidHobby;

public class Student {
	
	@Pattern(regexp = "[^0-9]*")
	private String studentName;
	
	//JSR - Java community
	//@Size(min = 2, max = 10, message = "Please enter a value for studentHobby field between 2 and 30 characters")
	//@IsValidHobby(listOfValidHobbies= "Music|Football|Cricket|Hockey")
	@Size(min = 2, max = 10) @IsValidHobby()
	private String studentHobby;
	
	private int studentId;
	
	//@Max(1000000000)
	private Long studentMobile;
	
	//The value should be future
	@Past
	private Date studentDOB;
	private ArrayList<String> studentSkills;
	private Address studentAddress;
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public String getStudentHobby() {
		return studentHobby;
	}
	public void setStudentHobby(String studentHobby) {
		this.studentHobby = studentHobby;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public Long getStudentMobile() {
		return studentMobile;
	}
	public void setStudentMobile(Long studentMobile) {
		this.studentMobile = studentMobile;
	}
	public Date getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(Date studentDOB) {
		this.studentDOB = studentDOB;
	}
	public ArrayList<String> getStudentSkills() {
		return studentSkills;
	}
	public void setStudentSkills(ArrayList<String> studentSkills) {
		this.studentSkills = studentSkills;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
	
	
	

}
