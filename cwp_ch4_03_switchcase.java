package com.company;

public class cwp_ch4_03_switchcase {
    public static void main(String[] args){

        String name = "Pallav";
        switch (name){
            case " Rahul":
                System.out.println("hii");
                break;
            case "Pallav":
                    System.out.println("Hii, I am Pallav");
                    break;
            default:
                System.out.println("Hello");

        }
       /* int num;
        System.out.println("Enter Your Number:-  ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch(num){
            case 18:
                System.out.println("You are going to become an Aduilt!");
               break;
            case 23:
                System.out.println("You are going to join a jjob!");
               break;
            case 60:
                System.out.println("you are going to get retired");
                break;
            default:
                System.out.println("Enjoy your life");
        }*/

       /*  int age;
        System.out.println("Enter Your Age:-  ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
       if (age>56){
        System.out.println("You are experienced! ");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("you are not experienced!");
        }*/
    }
}
