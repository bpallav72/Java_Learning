package com.company;

public class cwp_ch6_01_array {
    public static void main(String[] args) {
        /* class room of 5 students - you have to store marks of these 5 students
        we have two options:
        1. create 5 variables
        2. use array
        */
        // there are three main ways to create in java

       int[] marks = new int[5]; // declaration + memory allocation
       marks[0] = 100;
       marks[1] = 68;
       marks[2] = 75;
       marks[3] = 65;
       marks[4] = 87;
        System.out.println(marks[4]);

        int[] value;         //  declaration
        value = new int[5];  // memory allocation
        value[0] = 100;
        value[1] = 68;
        value[2] = 75;
        value[3] = 65;
        value[4] = 88;
        System.out.println(value[4]);

        int[] rate = {200,55,66,77,81};   // declaration,memory allocation and initialization together
        System.out.println(rate[4]);

    }
}
