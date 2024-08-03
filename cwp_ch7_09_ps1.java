package com.company;// write a java method to print multiplication table of a number n
import java.util.Scanner;
public class cwp_ch7_09_ps1 {

    static void multiplication(int a){
        for(int i=1;i<=10;i++){
          //  System.out.format("%d X %d = %d\n" ,a, i, a*i);
            System.out.println(a + " x " + i + " = " + a*i);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:- ");
        int a = sc.nextInt();

        multiplication(a);
    }
}

