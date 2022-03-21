package com.company.Day_23_homework_linkedList;

public interface MyList extends Iterable<MyLinkedList.Node> {
    int size();

    boolean isEmpty();

    int get(int index);

    void add(int val);

    void add(int index, int val);

    void delete(int index);
}
