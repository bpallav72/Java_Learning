package com.company;

/*
overloaded the employee constructor to initialize the salary to Rs 10,000
 */
class ConstOverload{
    private String name;
    private double salary;
    // Default constructor
    public ConstOverload(){
        name = "Unkown";
        salary = 10000.0; // initialize salary
    }
    // Constructor with parameters
    public ConstOverload(String employeeName){
        name = employeeName;
        salary = 10000.0;
    }
    // constructor with name and salary parameter
    public ConstOverload(String employeeName,double initialSalary){
        name = employeeName;
        salary = initialSalary;
    }
    public void display_Employee_info(){
        System.out.println("Name: "+ name);
        System.out.println("RS "+salary + "/-");
    }
}
public class cwp_Constructoroverloading {
    public static void main(String[] args) {
        String  name = new String();
        ConstOverload emp1 = new ConstOverload();
        emp1.display_Employee_info();
        ConstOverload emp2 = new ConstOverload("John");
        emp2.display_Employee_info();
        ConstOverload emp3 = new ConstOverload("Ram",15000.0);
        emp3.display_Employee_info();
       // System.out.println("Name" + emp3.name);
    }
}
