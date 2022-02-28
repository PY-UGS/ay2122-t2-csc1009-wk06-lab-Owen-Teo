package com.lab.lab6q1;

import java.util.*;

public class LinkedRandom {
    public static void main(String[] arg){
        System.out.println(random(1000, 9999, 500));

    }

    public static int random(int lowest, int highest, int range){
        LinkedList<Integer> list = new LinkedList<>();
        Random r = new Random();
        for (int i = 0; i < range; i++) {
            list.add(r.nextInt((highest - lowest) + 1) + lowest);
        }
        System.out.println("Random list : " + list);

        int var = r.nextInt((highest - lowest) + 1) + lowest;
        for (int i = 0; i < range; i++) {
            if (var == list.get(i)) {
                return var;

            }
        }
        System.out.println("Random number: ");
        return var;




    }
}
