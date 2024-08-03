package com.company;

public class cwp_ch7_04_method_overloading {
    static void foo(){
        System.out.println("Good morning");
    }
    static void foo(int a){
        System.out.println("Good morning " + a + " bro!");
    }
    static void foo(int a, int b){
        System.out.println("Good morning " + a + " bro!");
        System.out.println("Good morning " + b + " bro!");
    }

    static void Details(String name, int marks) {
        System.out.println("Welcome " + name);
        System.out.println("Your got "+ marks + " marks in exam.");
    }

    static void Details(String name, double marks) {
        System.out.println("Welcome " + name);
        System.out.println("Your got "+ marks + " marks in exam.");
    }

    public static void main(String[] args) {
        foo();
        foo(250);
        foo(3000,2500);        //Arguments are actual!

       Details("Ridhi", 89);
        Details("Ritesh", 93.5);
    }
}















