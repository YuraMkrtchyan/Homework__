package com.company.Day_19_homework.task3;

public class TaxAccounting extends Accounting{
// ● Write TaxAccounting class, which has fields:
// countOfEmployers,departmentName, which extend Accounting class and
// override account() method,which calculate taxOfCompany
    final static int tax = 10;


    public TaxAccounting(int countOfEmployers) {
        super(countOfEmployers);
    }

    @Override
    protected void account() {
        System.out.println(tax * getCountOfEmployers());
    }
}
