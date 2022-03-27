package com.company.Day_26_homework;
// 5. Create Pair interface with 2 generic types and with methods getKey(), getValue().
// Create DefaultPair class with 2 generic types which implements Pair interface.
// DefaultPair has following fields` key, value.

public interface Pair <K, V>{
    K getKey();
    V getValue();
}
