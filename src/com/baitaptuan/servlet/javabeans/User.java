package com.baitaptuan.servlet.javabeans;

import java.io.Serializable;

public class User implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 1L;
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String address;
	private String passWord;
	private String userName;
	private String school;
	private String classSchool;
	private String favourite;
	private String archivement;
	private String research;
	
	
	public User(int id, String firstName, String lastName, int age, String email, String address, String passWord,
			String userName, String school, String classSchool, String favorite, String archivement, String research) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.email = email;
		this.address = address;
		this.passWord = passWord;
		this.userName = userName;
		this.school = school;
		this.classSchool = classSchool;
		this.favourite = favorite;
		this.archivement = archivement;
		this.research = research;
	}
	public User(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getClassSchool() {
		return classSchool;
	}

	public void setClassSchool(String classSchool) {
		this.classSchool = classSchool;
	}

	public String getFavourite() {
		return favourite;
	}

	public void setFavourite(String favorite) {
		this.favourite = favorite;
	}

	public String getArchivement() {
		return archivement;
	}

	public void setArchivement(String archivement) {
		this.archivement = archivement;
	}

	public String getResearch() {
		return research;
	}

	public void setResearch(String research) {
		this.research = research;
	}

	

}
