package com.company;

import java.util.Scanner;
public class cwp_ch5_03_forloop {
    public static void main(String[] args) {
//        for(int i=1;i<=45;i++){
//            System.out.println(i);
//        }
//        int n=5;
//        for(int a=0;a<n;a++){
//            System.out.println(2*a+1);
//        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of natural number in reverse order:- ");
        int num = sc.nextInt();
        for(int b=num; b>0;b--){
            System.out.print(b);
        }

    }
}
