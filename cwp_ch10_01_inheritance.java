package com.company;

class Base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int x) {
        System.out.println("I am in base and setting X now");
        this.x = x;
    }

    public void printme() {
        System.out.println("I am a constuctor");
    }
}
   class Derived extends Base{
       int y;
       public int gety() {
           return y;
       }
           public void sety(int y){
           this.y = y;
        }

    }
public class cwp_ch10_01_inheritance {
    public static void main(String[] args){
      //  Creating an object of Base class
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setx(43);
        System.out.println(d.getx());

        d.sety(55);
        System.out.println(d.gety());

    }
}
