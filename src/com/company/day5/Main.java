package com.company.day5;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Armen Sargsyan", 56, "Baghramyan 26");
        Person p2 = new Person("David", 24, "Komitas 7");
        p1.info("Armen Sargsyan", 56, "Baghramyan 26");
        p2.info("David", 24, "Komitas 7");
        System.out.println();

        Employee em1 = new Employee(1027, "Hayk", "Abovyan 5", 24, 'm', 250000, "hayk@gmail,com");
        Employee em2 = new Employee(1045, "Nare", "Tumanyan 24", 28, 'f', 200000 , "nare@gmail.com");
        Employee em3 = new Employee(1157, "Tatev", "Abovyan 5", 35, 'f', 280000 , "tatev@gmail.com");
        Employee em4 = new Employee(1298, "Arman", "Mashtots 17", 42, 'm', 300000 , "arman@gmail.com");
        Employee em5 = new Employee(2415, "Vazgen", "Abovyan 5", 21, 'm', 240000, "vazgen@gmail.com");

        em1.info();
        em2.info();
        em3.info();
        em4.info();
        em5.info();

        Employee em6 = new Employee("Vahe", 200000);
        Employee em7 = new Employee();
        em7.info();

        em6.info();
        System.out.println();


        Author author1 = new Author("Tumanyan", "Tumanyan@gmail.com", 'm');
        author1.info("Tumanyan", "gTumanyan@gmail.com", 'm');
        System.out.println();

        Author author2 = new Author("J.R.R. Tolkien", "tolkien@gmail.com", 'm');
        Book book1 = new Book("The Lord of the Rings", author2, 48.9);
        Book book2 = new Book("The Hobbit", author2, 14.5);
        book1.info("The Lord of the Rings", author2, 48.9);
        book2.info("The Hobbit", author2, 14.5);


    }
}
