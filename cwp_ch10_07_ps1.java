package com.company;

/*
create a class circle and use inheritance to create another class cylinder from it.
 */
class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am non param of circle");
    }
    Circle1(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI* this.radius*this.radius;
    }
}
class cylinder3 extends Circle1{
    public int height;
    cylinder3(int r,int h){
        super(r);
        System.out.println("I am cylinder3 parameterized constructor");
        this.height = h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class cwp_ch10_07_ps1 {
    public static void main(String[] args) {

        //circle objc = new circle(12);
         cylinder3 obj = new cylinder3(12,4);
    }
}