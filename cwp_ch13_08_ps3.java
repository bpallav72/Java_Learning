/*Question 3: Demonstrate getPriority() and setPriority() methods in java Threads.
  Question 4: How do you get state of a given tread in java?
   Question 5: HOw do you get referance to the current thread in java
   */
package com.company;
class practice2 extends Thread{
    public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class practice2b extends Thread{
    public void run(){
//        while(true){
//            try{
//                Thread.sleep(200);
//            }
//            catch(Exception e){
//                System.out.println(e);
//            }
//
//            System.out.println("Welcome");
//        }
    }
}
public class cwp_ch13_08_ps3 {
    public static void main(String[] args) {
        practice2 p1 = new practice2();
        practice2b p2 = new practice2b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());  // Question 4
        //p1.start();
        p2.start();
        System.out.println(p2.getState());  // Question 4
        System.out.println(Thread.currentThread().getState()); // question 5

    }
}

