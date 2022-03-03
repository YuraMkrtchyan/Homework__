package com.company.Day_19_homework.task3;

public class Marketing extends ItCompany {
    //● Write Marketing class, which extend iTCompany class and has fields:
    // countOfEmployers, departmentName and has method marketing()
    public Marketing(int countOfEmployers) {
        super(countOfEmployers);
    }
    public Marketing(){}

    protected void marketing() {
        System.out.println("marketing Marketing");
    }
}
