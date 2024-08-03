package com.company;/*
Create a class rectangle with a method to initialize its , calculating area , perimeter etc.
*/
import java.util.Scanner;
class Rectangle {
    int l, w;

    public Rectangle(int l, int w) {
        this.l = l;
        this.w = w;  // constructor
    }
    public int getLength() {
        return l;
    }
    public void setLength(int l) {
        this.l = l;
    }
    public int getWidth() {
        return w;
    }
    public void setWidth(int w) {
        this.w = w;
    }

    public int Area() {
        return l * w;
    }
    public int Perimeter() {

        return 2 * (l + w);
    }
}
public class cwp_ch8_05_ps4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length:- ");
        int l = sc.nextInt();
        System.out.print("Enter width:- ");
        int w =sc.nextInt();
        Rectangle rect = new Rectangle(l,w);
        System.out.println("Area of Rectangle = "+ rect.Area());
        System.out.println("Perimeter of Rectangle = "+ rect.Perimeter() );
    }
}
