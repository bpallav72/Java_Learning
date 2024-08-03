package com.company;/* write a java program to print multiplication table of 10 in reverse order */

public class cwp_ch5_06_ps4 {
    public static void main(String[] args) {
      /*  int n = 10;
        for(int i = 10; i>=1;i--){
            System.out.printf("%d * %d =%d\n",n ,i, n*i);
        } */

        

// write a program to find factorial of a given number using for loops
// factorial(!) 5! = 5*4*3*2*1 = 120
     /*    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to calculate factorial:- ");
        int num = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=num;i++) {
            fact = fact * i;
        }
            System.out.print(fact);
*/

// write a program to calculate the sum of the number occuring in the multiplication table of 8
        int n = 8;
        int sum = 0;
        for(int i = 10; i>=1;i--){
           sum += n*i;
        }
            System.out.print(sum);
    }
}
