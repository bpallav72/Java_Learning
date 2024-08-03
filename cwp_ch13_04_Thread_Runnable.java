package com.company;
class Myclass extends Thread implements Runnable{
    public Myclass(int i,String name){ // create a constructor
        super(name);
    }
    public void run(){
        System.out.println("hey, Good Morning");
    }
}
public class cwp_ch13_04_Thread_Runnable {
    public static void main(String[] args) {
        Myclass my = new Myclass(23,"pallav");
        Thread th = new Thread(my,"Rahul");
        th.start();
       //my.start();
        //System.out.println("this id of the Thread my is " + my.getId());
        System.out.println("This id of my thread th is: " +th.getId());
        System.out.println("This name of  thread  is: " +th.getName());
        System.out.println("The name of my Thread is: "+ my.getName());
        System.out.println("The state of my Thread is: "+ my.getState());
        System.out.println("The thread group of my Thread is: "+ my.getThreadGroup());
        System.out.println("The priority of my Thread is: "+ my.getPriority());
        System.out.println("Stack Trace of my Thread is: "+ my.getStackTrace());
        System.out.println("Class of my Thread is: "+ my.getClass());
        System.out.println("Context class loader of my Thread is: "+ my.getContextClassLoader());
        System.out.println("Uncaught Exception Handler of my Thread is: "+ my.getUncaughtExceptionHandler());
    }
}
