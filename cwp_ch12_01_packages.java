package com.company;
import java.util.Scanner;
// All java class import  by use java.util.*
//import java.util.*;
public class cwp_ch12_01_packages {
    public static void main(String[] args) {

        // if, you are not import a scanner class then, you can write this type scanner.
//        java.util.Scanner s = new java.util.Scanner((System.in));
//        int a = s.nextInt();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("This is taking input as: "+ a);
    }
}
