package com.lab.lab6q1;

import java.util.LinkedList;
public class Linked {
    public static void main (String[] arg){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(11);
        System.out.println("Before change:" + list);
        addSort(list, 2);
        System.out.println("After change: " + list);


    }

    public static void addSort(LinkedList<Integer>list, int value){
        for (int i = 0; i < list.size(); i++) {
            if (value < list.get(i)) {
                list.add(i, value);
                return;
            }
        }

    }

}
