package com.redcompany.red.sax;


import com.redcompany.red.xml.Family;
import com.redcompany.red.xml.Mother;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;


public class FamilyDefaultHandler extends DefaultHandler {

	private Family family;
	private Mother mother;
	private String textValue;
	
	
	
	@Override
	public void startDocument() throws SAXException{
		System.out.println("start");
	}
	@Override
	public void endDocument() throws SAXException {
		// TODO Auto-generated method stub
		System.out.println("end");
	}

	
	@Override
	public void characters(char[] ch, int start, int lenght) throws SAXException {
	
		textValue = new String(ch, start, lenght);
		
//System.out.println("______________________________");
//System.out.println(new String(ch, start, lenght));

//System.out.println("*************************");	
//System.out.println(ch);
//System.out.println(start +" , "+lenght);

		
	}

	@Override
	public void endElement(String url, String localName, String qName)
			throws SAXException {	
		switch (qName) {
		case "family":
			break;
		case "mother":
			family.setMother(mother);
			break;
		case "maidenname":
			mother.setMaidenname(textValue);
			break;	
		case "name":
			mother.setName(textValue);
			break;	
		case "surname":
		//	mother.setSurname(qName);;
			break;	
		default:
			break;
		}
	}

	@Override
	public void startElement(String url, String localName, String qName,
			Attributes attr) throws SAXException {
		switch (qName) {
		case "family":
		family = new Family();
		family.setAdress(attr.getValue("adress"));
			break;
		case "mother":
			mother = new Mother();
			break;
		case "maidenname":
		//	textValue =localName.get
			break;	
		case "name":
		//	mother.setName();
			break;	
		case "surname":
		//	mother.setName(name);
			break;	
		default:
			break;
		}				
	}
	
	public Family getFamily() {
		return family;
	}
	
	
	
}
