package com.company;

abstract class Parent{
    public Parent(){
        System.out.println("I am constructor of parent");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child2 extends Parent {
    public void greet(){
        System.out.println("Good Morning");
    }
    public void greet2(){
        System.out.println("Good afternoon");
    }
}
abstract class child3 extends Parent{
    public void th(){
        System.out.println("I am good");
    }
}
public class cwp_ch11_01_abstract {
    public static void main(String[] args) {
      child2 c = new child2();
      c.greet();
       c.sayHello();
       c.greet2();
      // c.th();
      // Parent p = new Parent(); // error because it is not possible to create an object of an abstract class
       //child3 c3 = new child3();// error because it is not possible to create an object of an abstract class
       }
    }

