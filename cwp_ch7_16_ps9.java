package com.company;// write a function to convert celsius temperature into fahrenheit
import java.util.Scanner;
public class cwp_ch7_16_ps9 {
    static float fahren_cel(float celsius){
       float  fahrenheit = (celsius*9/5)  + 32;
       return fahrenheit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in celsius: ");
        float celsius = sc.nextFloat();
        System.out.println("Temperature in celsius:  " + celsius + "°c");
        System.out.print("Temperature in fahrenheit: " + fahren_cel(celsius)+"°f");
    }
}
