package com.company;//Wwrite a program to check whether the number is even or odd using switch statement

import java.util.Scanner;
public class cwp_ch4_04_switchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        System.out.println("Enter your number");
         num = sc.nextInt();
        switch (num % 2){
            case 0 -> {
                System.out.println(" This is a Even Number ");
            }
            case 1 -> {
                System.out.println("This  is a odd Number ");
            }
        }




    }
}
