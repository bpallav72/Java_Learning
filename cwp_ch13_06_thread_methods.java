package com.company;
class MyNewThr1 extends Thread{
    public void run(){
        int i = 0;
        while(true){
            System.out.println("Thank you: ");
            try {
                Thread.sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i++;
        }
    }
}
class MyNewThr2 extends Thread{
    public void run(){
        int j = 0;
        while(true){
            System.out.println("My Thank you");
        j++;
        }
    }
}
public class cwp_ch13_06_thread_methods {
    public static void main(String[] args) {
        MyNewThr1 t1 = new MyNewThr1();
        MyNewThr2 t2 = new MyNewThr2();
        t1.start();
//        try {
//            t1.join(); // join method allow one thread to wait until another thread completes its execution
//        }
//       catch (Exception e){
//           System.out.println(e);
//       }
        t2.start();
    }
}
