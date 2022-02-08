package com.company.day_5_homework;

public class Author {
    String name;
    String eMail;
    char gender;

    public Author(String name, String eMail, char gender) {
        this.name = name;
        this.eMail = name;
        this.gender = gender;
    }

    public void info(String name, String eMail, char gender){
        System.out.println("name:" + this.name + "  eMail:" + this.eMail + "  gender:" + this.gender);
    }
}
