package com.company;// write a recursive function to calculate sum of first n natural numbers.
import java.util.Scanner;
public class cwp_ch7_10_ps3 {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        else {
            return n + sumRec(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your natural number:- ");
        int n = sc.nextInt();
       int a = sumRec(n);
        System.out.print("Sum of natural number:- ");
        System.out.println(a);

    }

   /*
   public static void main(String[] args) {
       int sum = 0;
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       for(int i=0;i<=n;i++){
           sum +=i;
       }
       System.out.println(sum);
   } */
}
