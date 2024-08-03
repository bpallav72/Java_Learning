package com.company;

class Base1 {
    Base1() {
        System.out.println("I am a constructor");
    }
    Base1(int x){
        System.out.println("I am an overloaded constructor with value of a as: " + x);
    }
}
    class Derived1 extends Base1 {
        Derived1() {
           // super(1);
            System.out.println("I am a derived class constructor");
        }
        Derived1(int x,int y){
            super(x);
            System.out.println("I am an overloaded constructor of Derived with value of y as: " + y);
            }
    }
    class ChildofDerived extends Derived1{
    ChildofDerived() {
        System.out.println("I am child Derived constructor");
    }
    ChildofDerived(int x,int y,int z) {
        super(x,y);
        System.out.println("I am an overloaded constructor of Derived with value of z as: " + z);
    }
    }

public class cwp_ch10_03_constructor_in_inheritance {
    public static void main(String[] args) {


  //     Base1 b = new Base1();
//      Derived1 d = new Derived1();
      //  Derived1 s = new Derived1(14,9);
        ChildofDerived cd = new ChildofDerived(12,13,15);
    }
}
