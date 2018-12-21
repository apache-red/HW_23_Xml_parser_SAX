package com.redcompany.red.xml;

public class Mother extends  FamilyMember {

	private String name;	
	private String surname;
	private String maidenname;
	private String gender;
	private int age;

	public Mother(String name, String surname, String maidenname, String gender, int age) {
		this.name = name;
		this.surname = surname;
		this.maidenname = maidenname;
		this.gender = gender;
		this.age = age;
	}
	public Mother() {
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public void setMaidenname(String maidenname) {
		this.maidenname = maidenname;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Mother{" +
				"name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", maidenname='" + maidenname + '\'' +
				", gender='" + gender + '\'' +
				", age=" + age +
				'}';
	}
}
