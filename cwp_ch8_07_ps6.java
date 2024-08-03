package com.company;/*
Create a class circle with a method to initialize its , calculating area , perimeter etc.
 */
import java.util.Scanner;
class Circle{
    double radius;
    public Circle(double r){
        this.radius = radius;
    }
    public double area(){
        return  3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }
}
public class cwp_ch8_07_ps6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius of circle:- ");
        double radius = sc.nextDouble();
        Circle cir = new Circle(radius);
        System.out.println("Area of circle:- "+ cir.area());
        System.out.println("Perimeter of circle:- "+ cir.perimeter());

    }
}
