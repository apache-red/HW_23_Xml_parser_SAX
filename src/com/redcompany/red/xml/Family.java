package com.redcompany.red.xml;

public class Family {

	private String adress;
	private Mother mother;
	public Family(String adress, Mother mother) {
		super();
		this.adress = adress;
		this.mother = mother;
	}
	
	public Family() {
		// TODO Auto-generated constructor stub
	}

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public Mother getMother() {
		return mother;
	}
	public void setMother(Mother mother) {
		this.mother = mother;
	}

	@Override
	public String toString() {
		return "Family [adress=" + adress + ", mother=" + mother + "]";
	}
	
	
	
	
	
}
