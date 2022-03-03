package com.company.Day_19_homework.task3;

public class ItCompany {
// ● Write ItCompany java class which has fields: countOfEmployers,
// companyName and has method account()
    protected int countOfEmployers;
    protected String companyName;

    public ItCompany() {}

    protected void account(){}

    public ItCompany(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    public int getCountOfEmployers() {
        return countOfEmployers;
    }
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }
}
