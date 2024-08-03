package com.company;

/* writea function to print the following pattern using recursion:
 * * * *
 * * *
 * *
 *
 */
public class cwp_ch7_14_ps7 {
static void pattern2_rec(int n){
    if(n>0){
      //  for(int i=0;i<n;i++){
        for(int i=n;i>0;i--){
            System.out.print("* ");
        }
        System.out.println();
        pattern2_rec(n-1);
    }
}

    public static void main(String[] args) {
        pattern2_rec(4);
    }
}
