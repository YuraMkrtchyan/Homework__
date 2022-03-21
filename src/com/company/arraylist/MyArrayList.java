package com.company.arraylist;

import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList implements List {
    private int size;
    private Integer[] array;
    private static final int CAPACITY = 5;
    int currentCapacity = CAPACITY;

    public MyArrayList() {
        this.array = new Integer[CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }


    @Override
    public int indexOf(int val) {
        for (int i = 0; i < size; i++) {
            if (array[i] == val) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void set(int index, int val) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = val;
    }

    @Override
    public void add(int val) {
        if (size >= currentCapacity) {
            capacity();
        }
        array[size] = val;
        size++;
    }

    @Override
    public void capacity() {
        currentCapacity = currentCapacity * 2;
        array = Arrays.copyOf(this.array, currentCapacity);
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size == currentCapacity) {
            capacity();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = val;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    @Override
    public void contains(int val) {
        for (int i = 0; i < size; i++) {
            if (array[i] == val) {
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }

    @Override
    public String toString() {
        return "MyArrayList{" +
                "size=" + size +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iter();
    }

    private class Iter implements Iterator<Integer> {
        int index = 0;

        @Override
        public boolean hasNext() {
            return index < size;
        }

        @Override
        public Integer next() {
            return array[index++];
        }
    }
}
