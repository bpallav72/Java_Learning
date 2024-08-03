/*Question 1: write a program to print "Good Morning" and "Welcome" continuosly on the screen in
java using
Question 2: add a sleep method in welcome thread of question 1 to delay its execution for 200ms.
*/
package com.company;
class practice1 extends Thread{
   public void run(){
        while(true){
            System.out.println("Good Morning");
        }
    }
}
class practice1b extends Thread{
   public void run(){
        while(true){
            try{
                Thread.sleep(200);
            }
            catch(Exception e){
                System.out.println(e);
            }

            System.out.println("Welcome");
        }
    }
}
public class cwp_ch13_07_ps1 {
    public static void main(String[] args) {
        practice1 p1 = new practice1();
        practice1b p2 = new practice1b();
        p1.start();
        p2.start();

    }
}
