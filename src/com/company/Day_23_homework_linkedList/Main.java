package com.company.Day_23_homework_linkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        list.add(12);
        list.add(34);
        list.add(56);

        for (MyLinkedList.Node node : list) {
            System.out.println(node.val);
        }

//        list.delete(2);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
        System.out.println(list.toString());
    }
}
