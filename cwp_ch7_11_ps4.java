package com.company;

/* writea function to print the following pattern:
* * * *
* * *
* *
*
 */
public class cwp_ch7_11_ps4 {
    static void pattern2(int n){
        for(int i=0;i<n;i++) {
            for (int j = n; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pattern2(4);
    }
}
