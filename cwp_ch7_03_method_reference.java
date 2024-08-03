package com.company;

public class cwp_ch7_03_method_reference {
    static void change(int a){
        a = 98;
    }
    static void change2(int[] arr){
        arr[0] = 98;
        arr[3] = 75;
    }
    static void telljoke() {
        System.out.println("I invented a new word!\n" + "plagiarism");
    }
        public static void main(String[] args){
            //telljoke();
//            int[] marks = {52,73,77,89,98,94};
            // case 1: changing the integer
//            int x = 45;
//            change(x);
//            System.out.println("the value of marks after running change is: " + x);

            // changing the array
            int [] marks1 = {52,73,77,89,98,94};
            change2(marks1);
            System.out.println("the value of  marks[0] after running change is : " + marks1[0]);
            System.out.println("the value of  marks[3] after running change is : " + marks1[3]);
        }
    }

