package com.company;

class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
       // System.out.println("my salary is "+ salary);
    }
    public int getSalary(){

        
        return salary;
    }
}
public class cwp_ch8_01_custom_class {
    public static void main(String[] args) {
        System.out.println("This our coustom class ");
        Employee Rahul = new Employee();  // Instantiating a new Employee object
        Employee Akash = new Employee();
        // setting attributes for Rahul
       Rahul.id = 13;
       Rahul.name = "codewithrahul";
       Rahul.salary = 34000;

        // setting attributes for Akash
       Akash.id = 23;
       Akash.name = "Akash kumar";
       Akash.salary = 20000;

        // Printing the Attributes
       // System.out.println(Rahul.id);
       // System.out.println(Rahul.name);

        Rahul.printDetails();
        System.out.println(Rahul.getSalary());
        Akash.printDetails();
        System.out.println(Akash.getSalary());
    }
}
