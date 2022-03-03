package com.company.Day_19_homework.task2;

public class Main {
    public static void main(String[] args) {
        TaxAccounting taxAccounting = new TaxAccounting(25);
        taxAccounting.account();
        FinancialAccount financialAccount = new FinancialAccount(25);
        financialAccount.account();
    }
}
