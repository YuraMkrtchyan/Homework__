package com.company.Day_23_homework_linkedList;

import java.util.Iterator;

public class MyLinkedList implements MyList {
    private int size;
    private Node head;

    public MyLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    private boolean isElementIndex(int index){
        return (index >= 0 && index < size);
    }
    private void checkElementIndex(int index){
        if (!isElementIndex(index)){
            throw new IndexOutOfBoundsException(index);
        }
    }

    @Override
    public int get(int index) {
        this.checkElementIndex(index);
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.val;
    }

    @Override
    public void add(int val) {
        Node newNode = new Node(val);
        if (size == 0) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void add(int index, int val) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Node newNode = new Node(val);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    @Override
    public void delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }
        size--;
    }

    @Override
    public String toString() {
        Node current = head;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        while (current != null) {
            sb.append(current.val);
            sb.append(" -> ");
            current = current.next;
        }
        sb.append("null]");
        return sb.toString();
    }


    public Iterator<Node> iterator() {
        return new NodeIterator();
    }

    private class NodeIterator implements Iterator<Node> {
        Node current = head;

        public boolean hasNext() {
            return current != null;
        }
        Node temp;
        public Node next() {
            temp = current;
            current = current.next;
            return temp;
        }
    }



    public static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }
}
