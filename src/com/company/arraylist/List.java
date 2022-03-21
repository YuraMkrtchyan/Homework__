package com.company.arraylist;

import java.util.ArrayList;

public interface List extends Iterable<Integer> {
    int size();

    boolean isEmpty();

    int indexOf(int val);

    int get(int index);

    void set(int index, int val);

    void add(int val);

    void add(int index, int val);

    void remove(int index);

    void contains(int val);

    void capacity();
}
