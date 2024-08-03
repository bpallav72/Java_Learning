package com.company;

/*
Create a class cellphone with methods to print "ringing....,vibrating..."etc
 */
class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Rahul...");
    }
}
public class cwp_ch8_03_ps2 {
    public static void main(String[] args) {
        cellphone samsung = new cellphone();
        samsung.callFriend();
        samsung.vibrate();
        samsung.ring();
    }
}
