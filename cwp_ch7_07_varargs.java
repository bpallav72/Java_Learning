package com.company;

public class cwp_ch7_07_varargs {
   /* static int sum(int x,int y) {
        return x + y;
    }
        static int sum(int x,int y,int z){
            return x+y+z;
    }
 */
    static int sum(  int j,int ...arr){      //If, one parameter is compalsary for at least give one argument
        // available as int[] arr

        int result = j;
        for(int a: arr){
          result+=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("This is varags");
        System.out.println("the sum of nothing is: " + sum(4));   // give a one compalsary argument // output 4
        System.out.println("The sum of 4 and 5 is: " + sum(4,5)); // output 9
        System.out.println("The sum of 4,3 and 5 is: " + sum(4,3,5)); // output 12
        System.out.println("The sum of 4,3 and 5 is: " + sum(4,3,5,8,9)); // output 29
    }
}
