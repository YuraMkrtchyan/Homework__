package com.company.Day_19_homework.Task2;

public class Accounting {
    //    Task 2
//● Write Accounting.java class, which has fields:
// countOfEmployers, departmentName and has method account()
//●	Write TaxAccounting class, which has fields:
// countOfEmployers,departmentName, which extend Accounting class
// and override account() method,which calculate taxOfCompany
//●	Write FinancialAccount class, which has fields:
// countOfEmployers,departmentName, which extend TaxAccounting class
// and override account() method,which calculate salaryOfEmployers

    protected int countOfEmployers;
    protected String departmentName;

    public Accounting() {}

    public Accounting(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public void account() {
        System.out.println("Accounting class");
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }
}
