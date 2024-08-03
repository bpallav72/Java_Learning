package com.company;

/*
create a class Telephone with ring(),lift(),and disconnected() methods as abstract methods create another
 class Smarttelephone and demonstrate polymorphism
 */
abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnected();
}
class smartTelephone extends Telephone{
    public void ring(){
        System.out.println("Ringing....");
    }
    public void lift(){
        System.out.println("Lift the phone");
    }
    public void disconnected(){
        System.out.println("Disconnected...");
    }
}

public class cwp_ch11_07_ps4 {
    public static void main(String[] args) {
       Telephone tp = new smartTelephone();
       tp.ring();
       tp.lift();
       tp.disconnected();
       smartTelephone sm = new smartTelephone();
       //smartTelephone smp = new Telephone(); //Telephone' is abstract; cannot be instantiated
    }
}
