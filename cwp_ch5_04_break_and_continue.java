package com.company;

public class cwp_ch5_04_break_and_continue {
    public static void main(String[] args) {
     //   Break statement
//        for(int i=0;i<5;i++){
//            System.out.println(i);
//            System.out.println("java is great");
//            if(i==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//        }
//        System.out.println("Loop ends here");


//        int a=0;
//        while(a<5){
//            System.out.println(a);
//            System.out.println("java is great");
//            if(a==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            a++;
//        }
//        System.out.println("Loop ends here");


//        int c=0;
//        do{
//            System.out.println(c);
//            System.out.println("java is great");
//            if(c==2){
//                System.out.println("Ending the loop");
//                break;
//            }
//            c++;
//        }while(c<5);
//        System.out.println("Loop ends here");

        // continue statement
        for(int i=0;i<5;i++){
            if(i==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(i);
            System.out.println("java is great");
        }
       System.out.println("Loop ends here");

        int c=0;
        do{
            c++;
            if(c==2){
                System.out.println("Ending the loop");
                continue;
            }
            System.out.println(c);
            System.out.println("java is great");

        }while(c<5);
        System.out.println("Loop ends here");
        }
}
