package com.company.day5;

public class Book {
    String name;
    Author author;
    double price;

    public Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public void info(String the_lord_of_the_rings, Author author2, double v){
        System.out.println("book's name:" + name + " author:" + author.name + " price:" + price);
    }

    public void printAuthorName(){
        System.out.println(author.name);
    }

    public void printAuthorEMail(){
        System.out.println(author.eMail);
    }

}
