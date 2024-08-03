package com.company;

/* write a program using function to print the following pattern:
*
* *
* * *
* * * *

 */
public class cwp_ch7_09_ps2 {
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1(4);
    }
}

