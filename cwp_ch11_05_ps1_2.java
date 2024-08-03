package com.company;

/*
 Question 1:- create an abstract class pen with methods write() and refill() as abstract methods
 Question 2:- use the pen class from Q1 to create a concrete class fountain pen with additional method
  changeNib()
 */
// Question 1
abstract class pen{
   abstract public void write();
   abstract public void refill();

}
// Question 2
class fountainPen extends pen{
    public void write(){
        System.out.println("Write..");
    }
    public void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}
public class cwp_ch11_05_ps1_2 {
    public static void main(String[] args) {
        fountainPen pen = new fountainPen();
        pen.changeNib();

    }
}
