package com.company.Day_18_homework;

public class PersonValidator {

//2. Add in Person class validations with getters and setters with following options
//-	firstName must be in range 3 to 15
//- lastName must be in range 6 to 20
//- age must be in range 18 - 99
//- gender must be male or female(compareToIgnoreCase())
//- passportId must be start with “AN” and contain 6 digits with length 8

    public static boolean isFirstNameInRange(String firstName) {
        return (firstName.length() >= 3 && firstName.length() <= 15);
    }

    public static boolean isLastNameInRange(String lastName) {
        return (lastName.length() >= 6 && lastName.length() <= 20);
    }

    public static boolean isAgeValid(int age) {
        return (age >= 18 && age <= 99);
    }

    public static boolean isGenderValid(String gender) {
        return (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female"));
    }


    public static boolean isPassportIdValid(String passportId) {
        return (passportId.length() == 8 && passportId.substring(0, 2).equals("AN")
                && stringIsNumber(passportId.substring(2)));
    }

    public static boolean stringIsNumber(String str) {
        char[] arr = str.toCharArray();
        for (char item : arr) {
            if (!Character.isDigit(item)) {
                return false;
            }
        }
        return true;
    }
}
