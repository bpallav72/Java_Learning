package com.company;

import java.util.Random;
import java.util.Scanner;
public class cwp_ex2sol {
    public static void main(String[] args){
        // 0 for Rock
        // 1 for Paper
        // 2 for Scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor ");
        int userinput = sc.nextInt();
        Random random = new Random();
        int computerinput = random.nextInt(3);
        if(userinput==computerinput){
            System.out.println("Draw");
        }
        else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1){
            System.out.println(" You Win!");
        }
        else{
            System.out.println("Computer Win!");
        }
        System.out.println("Computer choice: " + computerinput);
    }
}
