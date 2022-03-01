package com.company.Day_18_homework;

public class StoreValidator {
    public static void main(String[] args) {
        Store store = new Store(2, "Vahe", "14702584");
        System.out.println(store.isCountOfWorkersInRange());
        System.out.println(store.isNameValid());
        System.out.println(store.isPhoneNumberValid());
    }
}
