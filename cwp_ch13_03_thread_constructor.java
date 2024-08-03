package com.company;
class MyThr extends Thread{
    // Allocate a new Thread object. This constructer has the same effect as thread(null, null, name)
    // name: the name of the new thread
    public MyThr(String name){
        super(name);
    }
    public void run(){
        System.out.println("Thank you");
//        while(true){
//            System.out.println("I am a thread");
//        }
    }
}
public class cwp_ch13_03_thread_constructor {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Pallav");
        MyThr t2 = new MyThr("Ram");

        t1.start();
        t2.start();
        System.out.println("This id of the thread t is " + t1.getId());
        System.out.println("This name of the thread t is " + t1.getName());
        System.out.println("This id of the thread t is " + t2.getId());
        System.out.println("This name of the thread t is " + t2.getName());
    }
}
