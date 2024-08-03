package com.company;

interface MyCamera{
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
interface MyWifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}
// create a class and inherit mycellphone class use by extends keyword and interface MyCamera and MyWifi use by implemets keywoard
class MySmartPhone extends MyCellPhone implements MyCamera,MyWifi{
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
    public void connectToNetwork(String network){
        System.out.println("connecting to " + network);
    }
}
public class cwp_ch11_03_defaul_methods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4kVIdeo(); // print default methods to direct interfaces my camera
        //ms.greet(); // throws an error because greet method is private modifier
      String[] ar =  ms.getNetworks(); //    getNetworks store in String array
      for(String item: ar){
          System.out.println(item);
      }
    }
}
