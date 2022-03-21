package com.company.Day_22_homework.task2;

public class DefaultStack implements Stack {
//2. Create a Stack interface, which has methods push(int val) and pop().
// Define DefaultStack class which implements from Stack interface.
// This class has the following fields` int[] nums, int index, int MAX_SIZE = 5.
// Create 2 exception classes` EmptyStackException and StackIndexOutOfBoundsException,
// which extends from RuntimeException. If you try to push new element and there
// is no space in array, throw StackIndexOutOfBoundsException.
// If you try to pop element and there is no element in array, throw EmptyStackException

    private int[] nums = new int[5];
    private int index = 0;
    private int MAX_SIZE = 5;

    public static void main(String[] args) {
        DefaultStack defaultStack = new DefaultStack();

        defaultStack.push(23);
        defaultStack.pop();
        defaultStack.pop();
        defaultStack.push(34);
        defaultStack.push(45);
        defaultStack.push(56);
        defaultStack.push(56);
    }
    @Override
    public void push(int val) {
        if (index > 4) {
            throw new StackIndexOutOfBoundsException();
        }
        nums[index] = val;
        index++;
    }
    @Override
    public int pop() {
        if (index == 0) {
            throw new EmptyStackException();
        }
        index--;
        return nums[index+1];
    }
}
