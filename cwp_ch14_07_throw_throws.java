package com.company;

import java.util.Scanner;

// create custom exception
class NegativeRadiussException extends Exception{
@Override
    public String toString(){
        return"Radius cannot be negative!";
    }
  @Override
    public String getMessage(){
    return "Radius cannot be negative!";
    }
}
//-------------------- create a area method.


public class cwp_ch14_07_throw_throws {
    public static double area(int r)throws NegativeRadiussException{

        if(r<0){
            throw new NegativeRadiussException();

        }
        double result = Math.PI *r*r;
        return result;
    }
//----------------------- create a divide method.
    public static int divide(int a, int  b )throws ArithmeticException{
        int result = a/b;
        return result;
    }

    public static void main(String[] args) {

        //---------try catch for divide method
        try {
            int c = divide(6, 0);
        }
        catch (Exception e){
            System.out.println("Exception");
        }

        //--------- try catch for area method
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();

        try{

            double ar = area(r);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
            System.out.println(e.toString());
        }
    }
}
