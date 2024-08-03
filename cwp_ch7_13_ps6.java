package com.company;//write a function find average of a set of numbers passed as arguments
import java.util.Scanner;
public class cwp_ch7_13_ps6 {
static double findaverage(double... numbers){
    if(numbers.length==0){
        return 0;
    }
    double sum = 0;
    for(double num : numbers){
        sum = sum + num;
    }
    return sum / numbers.length;
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter count of numbers:- ");
        int count = sc.nextInt();

        double[] numbers = new double[count];
        System.out.print("Enter the number: " );
        for(int i=0;i<count;i++){
            numbers[i] = sc.nextDouble();
        }
      double average = findaverage(numbers);
        System.out.println("Average: " + average);



    }
}