package com.company;// what will be the output of this program:
import java.util.Scanner;
public class cwp_ch4_05_ps {
    public static void main(String[] args){
     /*   int a = 11;
        if(a = 11){
            System.out.println("i am in 11 ");  // eror because = is asignment operator
        } */

/* write a program to find out whether a student is pass or fail;
  if it requires total 40% and at least 33% in each subject to pass
  assume 3 subject and take marks as an input from the user */
 /*       byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in physics");
        m1 = sc.nextByte();
        System.out.println("Enter your marks in chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your marks in mathematics");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println("your overall precentage is: " + avg);
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("conguratulations, you have been prometed ");
        }
            else{
                System.out.println("sorry, you have not been promoed! please try again.");
            }*/

 // Calculate income tax paid by an employee to the goverment as per the slabs mention below:

 /*       Income   Slab      Tax
           2.5L  - 5.0L      5%
           5.0L  - 10.0L     20%
           Above   10.0L     30%
  Note that there is no tax below 2.5L. take input amount as an input from the user */
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter your income i Lakhs per annum");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<+2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if (income>5.0f && income<=10.0f){
            tax = tax + 0.05f * ( 5.0f - 2.5f);
            tax = tax + 0.2f  * (income - 5.0f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }
        System.out.println("The total tax paid by the employee is: "+ tax);


    }
}
