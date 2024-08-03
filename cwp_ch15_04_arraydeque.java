package com.company;

import java.util.ArrayDeque;

public class cwp_ch15_04_arraydeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(5);
        ad1.add(56);
        ad1.addFirst(88);
        System.out.println(ad1);
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
