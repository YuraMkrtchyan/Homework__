package com.company.Day_19_homework.Task3;

public class FinancialAccount extends TaxAccounting {
//● Write FinancialAccount class, which has fields:
//  countOfEmployers,departmentName, which extend TaxAccounting class
//  and override account() method,which calculate salaryOfEmployers
    final static int salary = 100;
    public FinancialAccount(int countOfEmployers){
        super(countOfEmployers);
    }

    @Override
    protected void account() {
        System.out.println(salary * countOfEmployers);
    }
}
