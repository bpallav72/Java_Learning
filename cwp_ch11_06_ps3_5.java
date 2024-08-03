package com.company;

/*
Question3:- Create a class Monkey with jump() and bite() methods. create a class human which inherits
this monkey class and implements BasicAnimal interface with eat() and sleep() method
Question5:- Demonstrate polymorphism using monkey class from Q3
 */
class monkey {
    void jump() {
        System.out.println("Jumping....");
    }

    void bite() {
        System.out.println("biting");
    }
}
     interface BasicAnimal{
         void eat();
         void sleep();
     }

     class Human extends monkey implements BasicAnimal{
         void speak(){
             System.out.println("Hello sir!");
         }
         @Override
         public void eat(){
             System.out.println("Eating");
         }
         public void sleep(){
             System.out.println("sleeping");
         }
     }
public class cwp_ch11_06_ps3_5 {
    public static void main(String[] args) {
        Human h = new Human();
        h.sleep();
        // Q5
        monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.speak(); // cannot use speak method because the reference is monkey which does not have speak method


        BasicAnimal lovish = new Human();
        // lovish.speak(); // error
    lovish.eat();
    lovish.sleep();
    }
}
