package com.company;// write a function to print Nth term of fibanacci series using recursion
import java.util.Scanner;
public class cwp_ch7_12_ps5 {
   static int fib(int n) {
       //   static void fib(int n){
       /* if(n==1){
            return 0;
        }
        else if(n==2) {
            return 1;
        }
        */
       if (n == 1 || n == 2) {
           return n - 1;
       } else {
           return fib(n - 1) + fib(n - 2);
       }
   }


       /* int a = 0;
        int b = 1;
        for(int i=0;i<n;i++){
            System.out.println(a);
            int c = b+a;
            a = b;
            b = c;
        }
        */
// fibnacci series - 0,1,1,2,3,5,8,13,21,34
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = sc.nextInt();
      //  fib(n);
       int result = fib(n);
           System.out.println("Print your fibnacci series");
      System.out.println(result);

    }
}
