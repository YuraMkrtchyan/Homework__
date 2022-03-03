package com.company.Day_19_homework.Task2;

public class FinancialAccount extends TaxAccounting{
//    Write FinancialAccount class, which has fields:
// countOfEmployers,departmentName, which extend TaxAccounting class
// and override account() method,which calculate salaryOfEmployers
    final static int salaryOfEmployers = 40;

    public FinancialAccount(int countOfEmployers){
        super(countOfEmployers);
    }
    @Override
    public void account() {
        System.out.println(salaryOfEmployers * countOfEmployers);
    }
}
