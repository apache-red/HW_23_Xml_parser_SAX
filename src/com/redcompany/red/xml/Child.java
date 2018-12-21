package com.redcompany.red.xml;

public class Child  extends FamilyMember{


    private String name;
    private String surname;
    private int age;
    private String gender;

    public Child() {
    }

    public Child(String name, String surname, int age, String gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }



    @Override
    public void setMaidenname(String textValue) {
    }


    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }
}
