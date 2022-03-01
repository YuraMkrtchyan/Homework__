package com.company.Day_18_homework;

public class Store {

// 4. Write a Store.java class which`
// - has a countOfWorkers, name, phoneNumber,
// array of product numbers(what kind of product are in store)
// where`
// - countOfWorkers must be in range 2 - 50
// - name must have at least 3 characters
// - phoneNumber must have 8 digits, also can not consist negative digits

    private int countOfWorkers;
    private String name;
    private String phoneNumber;
    private String[] products;

    public Store(int countOfWorkers, String name, String phoneNumber) {
        this.countOfWorkers = countOfWorkers;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public int getCountOfWorkers() {
        return countOfWorkers;
    }

    public void setCountOfWorkers(int countOfWorkers) {
        this.countOfWorkers = countOfWorkers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public boolean isCountOfWorkersInRange() {
        return (countOfWorkers >= 2 && countOfWorkers <= 50);
    }

    public boolean isNameValid() {
        char[] arr = name.toCharArray();
        if (!(arr[0] >= 'A' && arr[0] <= 'Z')) {
            return false;
        }
        for (int i = 1; i < arr.length; i++) {
            if (!(arr[i] >= 'a' && arr[i] <= 'z')) {
                return false;
            }
        }
        if (name.length() < 3) {
            return false;
        }
        return true;
    }

    public boolean isPhoneNumberValid() {
        if (phoneNumber.length() != 8) {
            return false;
        }
        char[] arr = phoneNumber.toCharArray();
        for (char item : arr) {
            if (!(item >= '0' && item <= '9')) {
                return false;
            }
        }
        return true;
    }
}
