package com.company;

class Phone{
    public void showtime(){
        System.out.println("Time is 8am");
    }
    public void on(){
        System.out.println("Turning on phone....");
    }
}
class Smartphone extends Phone{
    @Override
    public void on() {
        System.out.println("Turning on smartphone....");
    }
    public void welcome(){
        System.out.println("You are welcome");
    }
}
public class cwp_ch10_06_dynamic_method_dispatch {
public static void main(String[] args){
   Phone obj = new Phone();
//    Smartphone smobj = new Smartphone();
//    obj.name();
    Phone obj1 = new Smartphone(); // Allowed
    //Smartphone obj2 = new phone(); // not allowed
    obj1.showtime();
    obj1.on(); // Turning on smarphone....
    obj.on(); //turning on phone.....
    //obj1.welcome(); // not allowed
}
}
