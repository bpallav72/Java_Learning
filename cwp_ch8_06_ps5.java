package com.company;

/*
create a class Tommy vercetti for Rockstar Games capable of hitting( print hitting...), running,firing etc.
 */
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("running from the enemy");
    }public void fire(){
        System.out.println("firing on the enemy");
    }
}
public class cwp_ch8_06_ps5 {
    public static void main(String[] args) {
        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();
    }
}
