package com.redcompany.red.sax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class FamilySaxParser {

	
	
	
	public static void main (String[] arg) {
		
		try {
			parserFamilyXML();
		} catch (FamilyParserExeption e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
		
	public static void parserFamilyXML () throws FamilyParserExeption{
		try {
		//	XMLReader reader = XMLReaderFactory.createXMLReader("");		
		SAXParserFactory parserFactory = SAXParserFactory.newInstance();
		SAXParser parser = parserFactory.newSAXParser();
		//XMLReader reader = parser.getXMLReader();
		FamilyDefaultHandler fdhtr = new FamilyDefaultHandler();
		
		parser.parse("resources/Families.xml", fdhtr );
			
		
		
		System.out.println(fdhtr.getFamily());
		
		
		} catch (SAXException | ParserConfigurationException | IOException e) {	
		
			throw new FamilyParserExeption("some problem during SAX parser",e);
		}
	}
	
}
