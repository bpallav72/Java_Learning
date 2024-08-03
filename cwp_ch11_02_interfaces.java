package com.company;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
    interface HornBycile{
        void blowHornpmng();
        void blowHorndwk();
    }
}
class Avoncycle implements Bicycle, Bicycle.HornBycile {

    void blowHorn(){
        System.out.println("pee pee pee.....");
    }
   public void applyBrake(int decrement){
        System.out.println("Applying brake");
    }
   public void speedUp(int increment){
        System.out.println("Applying speedUp");
    }
    public void blowHornpmng(){
        System.out.println("main nikla gad le ke...");
    }
    public void blowHorndwk(){
        System.out.println("Dil walon ke dil ka..");
    }
}
public class cwp_ch11_02_interfaces {
    public static void main(String[] args) {
    Avoncycle cycle = new Avoncycle();
    cycle.applyBrake(1);
    // you can create properties in interfaces
        System.out.println(cycle.a);
        // you cannot modify the properties in interfaces as they are final.
       // cycle.a = 454;
       // System.out.println(cycle.a);
        cycle.blowHorndwk();
        cycle.blowHornpmng();
    }
}
