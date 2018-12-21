package com.redcompany.red.xml;

public class Mother {

	private String name;	
	private String surname;
	private String maidenname;
	private int age;
	
	public Mother(String name, String surname, String maidenname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.maidenname = maidenname;
		this.age = age;
	}
	public Mother() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getMaidenname() {
		return maidenname;
	}
	public void setMaidenname(String maidenname) {
		this.maidenname = maidenname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Mother [name=" + name + ", surname=" + surname
				+ ", maidenname=" + maidenname + ", age=" + age + "]";
	}
	
	
	
}
