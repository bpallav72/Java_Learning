package com.company;/* write a program to sum first n even numbers uaing while loop */
import java.util.Scanner;
public class cwp_ch5_06_ps2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of N:- ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 0;
        while(i<n) {
            sum = sum + (2 * i);
            System.out.print("Sum of even number is:- " + sum);
            i++;
        }

    }
}
