package com.company;

class MyMainEmployee {
   private int id;
   private String name;
   public MyMainEmployee(){
        this.id = 34;
       this.name = "Your_Name_Here"; // constructor
        }
       public MyMainEmployee(String myName,int myId){
        this.id = myId;
        this.name = myName; // arguments pass in constructor
    }
    public MyMainEmployee(String myName){
       name = myName;
    }
    public void display_Employee_info(){
        System.out.println( name);
        System.out.println(id);
    }
}
public class cwp_ch9_02_constructors {
    public static void main(String[] args) {
        MyMainEmployee ram = new MyMainEmployee("Ram");
        ram.display_Employee_info();
        MyMainEmployee akash = new MyMainEmployee("Abhishek",23);
        akash.display_Employee_info();
        MyMainEmployee raj = new MyMainEmployee();
        raj.display_Employee_info();


//        System.out.println(akash.id);
//        System.out.println(akash.name);
//        System.out.println();
//        System.out.println(raj.name);
//        System.out.println(raj.id);
    }
}
