package com.company;
class MyThr1 extends Thread {
    public MyThr1(String name) {
        super(name);
    }
    @Override
    public void run(){
       int i = 0;
       while(i<400){
           System.out.println("Thank you: " + this.getName());
           i++;
       }
    }
}
public class cwp_ch13_05_thread_priorities {
    public static void main(String[] args) {
        // Ready queue: T1 T2 T3 T4 T5
        MyThr1 t1 = new MyThr1("Pallav1(Minimum Priority)");
        MyThr1 t2 = new MyThr1("Pallav2(Normal Priority)");
        MyThr1 t3 = new MyThr1("Pallav3");
        MyThr1 t4 = new MyThr1("Pallav4");
        MyThr1 t5 = new MyThr1("Pallav5(Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

    }
}
