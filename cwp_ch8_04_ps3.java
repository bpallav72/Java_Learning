package com.company;/*
Create a class square with a method to initialize its , calculating area , perimeter etc.
*/
import java.util.Scanner;
class Square{
    int side ;
    public Square(int side){
        this.side =side;
    }
    public int area(){
        return side*side;
    }
    public int perimeter(){

        return 4*side;
    }
}



public class cwp_ch8_04_ps3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter side of square:-");
        int side = sc.nextInt();
        Square sq = new Square(side);
        System.out.println("Area of square = "+ sq.area());
        System.out.println("perimeter of square = "+ sq.perimeter());


    }



}
