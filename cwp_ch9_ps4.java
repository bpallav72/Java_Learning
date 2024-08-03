package com.company;

/*
overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters
 */
class Rectangle1{
    int length;
    int breadth;
    public Rectangle1(){
        this.length = 4;
        this.breadth =5; // constructor overload
    }



    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth; // create constructor
    }
}
public class cwp_ch9_ps4 {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(12,56);
        Rectangle1 rect = new Rectangle1();
        System.out.println("Rectangle of length: " + r.length);
        System.out.println("Rectangle of breadth:" + r.breadth);

        System.out.println("Rectangle of length: " + rect.length);
        System.out.println("Rectangle of breadth:" + rect.breadth);
    }
}
