/*
write a java program that allows you to keep accessing an array until a valid index is given.
 if ax retries exceed 5 print "Error"
 */
package com.company;

import java.util.Scanner;

public class cwp_ch14_11_ps3 {
    public static void main(String[] args) {
       boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while(flag && i<5){
            try {
                System.out.println("Enter the value of index:- ");
                int index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }
    }
}
