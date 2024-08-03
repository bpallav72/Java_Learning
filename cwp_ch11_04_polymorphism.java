package com.company;

interface MyCamera2{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4kVIdeo(){  // java allowed implement in interface by using default
        greet(); // printed from here as greet method id private
        System.out.println("Recording in 4k");
    }
}
interface MyWifi2{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone2{
   public void callNumber(long phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
// create a class and inherit mycellphone class use by extends keyword and interface MyCamera and MyWifi use by implemets keywoard
class MySmartPhone2 extends MyCellPhone2 implements MyCamera2,MyWifi2{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Rcord video  ");
    }

    //  public void record4kVIdeo(){ // override interfaces my camera
    //       System.out.println("Taking Snap and rcording in 4k");
    // }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Abhay","Amit","Raushan"};
        return networkList;
    }
    public void connectToNetwork(String network)
    {
        System.out.println("connecting to " + network);
    }
    void sampleMeth(){
        System.out.println("Meth");
    }
}
public class cwp_ch11_04_polymorphism {
    public static void main(String[] args) {
        MyCamera2 cam = new MySmartPhone2(); // this is a Smartphone but, use it as camera
       // MyCamera2 ca = new MyCamera2(); // this is a Smartphone but, use it as camera
        //cam.getNetworks();  // not allowed
       // cam.sampleMath(); // not allowed
        cam.record4kVIdeo();
        MySmartPhone2 s = new MySmartPhone2();
        s.sampleMeth();
        s.recordVideo();
        s.record4kVIdeo();
        s.getNetworks();
        s.callNumber(7277008534l);
    }
}
