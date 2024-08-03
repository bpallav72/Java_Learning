package com.company;

class MyThreadrunnable1 implements Runnable {
        public void run () {
        for(int i=0;i<40;i++){

        System.out.println("I am thread 1 not a threat");
    }
    }
}
class MyThreadrunnable2 implements Runnable {
    public void run() {
        for (int i = 0; i < 40; i++) {
            System.out.println("I am thread 2 not a threat");
        }
    }
}
public class cwp_ch13_02_runnable {
    public static void main(String[] args) {
        /*whenever we implement Runnable interface you can not directly run start() method on it, then
          create a new Thread Gun1() and given the thread to be runnable (bullet1) then
        */
        MyThreadrunnable1 bullet1 = new MyThreadrunnable1();
        Thread Gun1 = new Thread(bullet1);
        MyThreadrunnable2 bullet2= new MyThreadrunnable2();
        Thread  Gun2 = new Thread(bullet2);
        Gun1.start();
        Gun2.start();

    }
}
