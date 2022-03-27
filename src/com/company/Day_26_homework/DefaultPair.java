package com.company.Day_26_homework;

import Everything.inner_classes.Printer;

import java.util.Objects;

public class DefaultPair<K, V> implements Pair<K, V>{
    private K key;
    private V value;

    public DefaultPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return this.key;
    }

    @Override
    public V getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return "DefaultPair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
