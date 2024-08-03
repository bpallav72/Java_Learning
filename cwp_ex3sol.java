package com.company;/*
Create a class Game whichallows a user to play " Guess the Number" game once.
* Game should have the following methods.
* constructor to generate the randdom number.
* takeUserinput() to take a user input of number.
* isCorrectNumber() to detect whether the number entered by the user is true.
*getter and setter for noOfGusses use properties such as noOfGusses(int),etc
 */
import java.util.Random;
import java.util.Scanner;
class Game{
    public int number;
    public int inputNumber;
    public int noOfGusses=0;
    public int getNoOfGusses() {
        return noOfGusses;
    }

    public void setNoOfGusses(int noOfGusses) {
        this.noOfGusses = noOfGusses;
    }
    Game(){
        Random rand = new Random();
        this.number =rand.nextInt(100) ;
    }
    void takeUserInput(){
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
         noOfGusses++;
      if(inputNumber==number){
          System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts",number,noOfGusses);
          return true;
      }
      else if(inputNumber<number){
          System.out.println("Too low.....");
      }
      else if(inputNumber>number){
          System.out.println("Too high.....");
      }
      return false;
    }
}
public class cwp_ex3sol{
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectNumber();
        }
    }
}
