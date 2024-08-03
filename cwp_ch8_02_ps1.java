package com.company;

/* Create a java class Employee wih following properties and methods:
* salary (property)(int)
* get salary (method returning int)
* name (property)(string)
* get name(method returning string)
* set name (method changing name)
*/
class Employee1{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
public class cwp_ch8_02_ps1 {
    public static void main(String[] args) {
      Employee1 rahul = new Employee1();
      rahul.name="Rahul singh";
      rahul.salary = 234;
        System.out.println(rahul.getSalary());
        System.out.println(rahul.getName());

    }

}
