package com.company.Day_19_homework.task3;

public class Main {
    public static void main(String[] args){
        TaxAccounting taxAccounting = new TaxAccounting(20);
        taxAccounting.account();
        FinancialAccount financialAccount = new FinancialAccount(20);
        financialAccount.account();
        Marketing marketing = new Marketing();
        marketing.marketing();
        SMM smm = new SMM();
        smm.marketing();
        SEO seo = new SEO();
        seo.marketing();
    }
}