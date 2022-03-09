package com.company.task2;

public class DefaultStack implements Stack{
    int MAX_SIZE = 5;
    int[] nums = new int[MAX_SIZE];
    int index = 0;

    @Override
    public void push(int val) {
        if (index == MAX_SIZE){
            throw new StackIndexOutOfBoundsException();
        } else {
            nums[index++] = val;
        }
    }

    @Override
    public int pop() {
        int temp;
        if (index == 0) {
            throw new EmptyStackException();
        } else {
            temp = nums[--index];
            nums[index] = 0;
            return temp;
        }
    }
}
