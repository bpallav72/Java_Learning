package com.company;

public class cwp_ch7_08_recursion {
        // factorial(0) = 1
        // factorail(n) = n * n-1 *.....1
        // factorail(5) = 5 * 4 * 3 * 2 * 1 = 120
        // factoria(n) = n * factorial(n - 1)
        static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            }
            else {
                return n * factorial(n - 1);
            }
        }
        static int factorial_itreative(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                int product = 1;
                for (int i = 1; i <= n; i++) {
                    product *= i;
                }
                return product;
            }
        }
                public static void main (String[]args){
                int a = 9;
                //int b = 5;
                    System.out.println("The value of factorial n is: " + factorial(a));
                    System.out.println("This value of factorial n is: " + factorial_itreative(a));


                }

            }