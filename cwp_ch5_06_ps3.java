package com.company;/* write a program to print multiplication table of a given number n. */
import java.util.Scanner;
public class cwp_ch5_06_ps3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the value of n:-");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.printf("%d * %d = %d\n" ,n,i, n*i);
        }
    }
}
