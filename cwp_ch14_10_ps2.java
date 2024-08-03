package com.company;

/*
write a java program that prints "HaHa" during Arithmetic exception and "HeHe" during an illegal
argument exception
 */
public class cwp_ch14_10_ps2 {
    public static void main(String[] args) {
        try{
            int a = 66/0; // Arithmetic Exception
            System.out.println(a);
        }
        catch (IllegalArgumentException e){
            System.out.println("HeHe");
        }
        catch(ArithmeticException e){
            System.out.println("HaHa");
        }
    }
}
