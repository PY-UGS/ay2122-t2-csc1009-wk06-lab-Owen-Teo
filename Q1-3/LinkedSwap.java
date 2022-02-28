package com.lab.lab6q1;

import java.util.LinkedList;


public class LinkedSwap {
    public static void main(String[] arg){
        LinkedList<Integer> list = new LinkedList<>();

        list.add(8);
        list.add(11);
        list.add(15);
        list.add(19);
        list.add(22);
        list.add(26);

        int value1 = 8;
        int value2 = 22;

        System.out.println("Before change: " + list);
        swapping(list, value1, value2);
        System.out.println("After change: " + list);

    }

    public static void swapping(LinkedList<Integer> list, int val1, int val2){

        int num1 = list.indexOf(val1);
        int num2 = list.indexOf(val2);

        list.set(num1, val2);
        list.set(num2, val1);

    }
}
