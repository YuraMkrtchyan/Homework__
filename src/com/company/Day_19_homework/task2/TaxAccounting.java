package com.company.Day_19_homework.task2;

public class TaxAccounting extends Accounting {
    final static int tax = 10;

    public TaxAccounting(int countOfEmployers) {
        super(countOfEmployers);
    }

    @Override
    public void account() {
        System.out.println(this.countOfEmployers * tax);
    }
}