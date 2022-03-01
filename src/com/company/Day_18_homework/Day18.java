package com.company.Day_18_homework;

public class Day18 {
    public static void main(String[] args) {
        Person person = new Person("Armen", "Meliqyan",
                "AN102543", 20, "male", "armenian");
        person.display();
        System.out.println(PersonValidator.isAgeValid(20));
        System.out.println(PersonValidator.isFirstNameInRange("Armen"));
        System.out.println(PersonValidator.isLastNameInRange("Meliqyan"));
        System.out.println(PersonValidator.isGenderValid("male"));
        System.out.println(PersonValidator.isPassportIdValid("AN102543"));
    }
}

