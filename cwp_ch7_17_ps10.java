package com.company;/*
write a iterative function to calculate sum of first n natural numbers.
 */
import java.util.Scanner;
public class cwp_ch7_17_ps10 {
    static int sum_iterative(int n){
        int sum = 0;
        for(int i = 0;i<=n;i++){
            sum +=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your natural number:- ");
        int n = sc.nextInt();
        int a = sum_iterative(n);
        System.out.print("Sum of natural number:- " + a);
    }
}
