package com.redcompany.red.sax;


import com.redcompany.red.xml.*;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;



public class FamilyDefaultHandler extends DefaultHandler {

    private Society society;
    private Family family;
    private FamilyMember familyMember;
    private String textValue;

    public FamilyDefaultHandler() {
        society = new Society();
    }

    @Override
    public void startDocument() throws SAXException {
        System.out.println("Start parse XML...");
    }

    @Override
    public void endDocument() throws SAXException {
        System.out.println("END parse XML...");
    }

    @Override
    public void startElement(String url, String localName, String qName, Attributes attr) throws SAXException {
        switch (qName) {
            case "family":
                family = new Family();
                family.setAdress(attr.getValue("adress"));
                break;
            case "mother":
                familyMember = new Mother();
                break;
            case "father":
                familyMember = new Father();
                break;
            case "child":
                familyMember = new Child();
                break;
            case "maidenname":
                break;
            case "name":
                break;
            case "surname":
                break;
            case "age":
                break;
            case "gender":
                break;
            default:
                break;
        }
    }


    @Override
    public void characters(char[] ch, int start, int lenght) throws SAXException {
        textValue = new String(ch, start, lenght);
    }


    @Override
    public void endElement(String url, String localName, String qName)
            throws SAXException {
        switch (qName) {
            case "family":
                society.addFamilyToFamilyList(family);
                break;
            case "mother":
                family.setMother((Mother) familyMember);
                break;
            case "father":
                family.setFather((Father) familyMember);
                break;
            case "child":
                family.addChildToChaildList((Child) familyMember);
                break;
            case "maidenname":
                familyMember.setMaidenname(textValue);
                break;
            case "name":
                familyMember.setName(textValue);
                break;
            case "surname":
                familyMember.setSurname(textValue);
                break;
            case "age":
                familyMember.setAge(Integer.parseInt(textValue));
                break;
            case "gender":
                familyMember.setGender(textValue);
                break;


            default:
                break;
        }
    }



    public Family getFamily()
    {
        return family;
    }

    public Society getSociety()
    {
        return society;
    }

}
