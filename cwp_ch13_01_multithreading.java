

package com.company;
/* if you want to do threading then you need to write as a part of syntax
  * extends for using Thread class, override run() method....
 */
class MyThread1 extends Thread{
    /* -> run() :- if this thread was constructed using a separate Runnable run object,then that Runneble
                   object's run method is called;  otherwise, this method does nothing and returns.
     */
   @Override
   public void run(){
       int i = 0;
       while(i<40){
           System.out.println("My cooking Thread is Running");
           System.out.println("I am happy");
            i++;
       }
    }
}
class MyThread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<40){
            System.out.println("Thread 2 for chatting with her");
            System.out.println("I am sad!");
            i++;
        }
    }
}
public class cwp_ch13_01_multithreading {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        /* -> start():-
         cuases this thread to begin execution; the java virtual machine calls the run method fo
        this thread
        -> To start a thread you need to run the start() method
        -> The start() method internally calls the run() method
        -> All this implementation is inside thread.java
        */
        t1.start();
        t2.start();
    }
}
