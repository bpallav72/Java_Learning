package com.company;

public class cwp_ch14_01_errors {
    public static void main(String[] args) {
        /* syntax error :-
        When compiler finds something wrong with our program it throws a syntax error.
         */
        // int a = 5   // no semicolon(;), syntax error
        int a = 5;
        int b = 5;
       // System.out.println(a+b); // b is not intialize , syntax error
        System.out.println(a+b);
    }
}
