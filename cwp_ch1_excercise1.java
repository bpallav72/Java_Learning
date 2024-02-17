/* write a program to calculate percentage of a given student in cbse board
exam. his marks from 5 subject must be taken as input from the keyboard
(marks are out of 100).*/

import java.util.Scanner;
public class cwp_ch1_excercise1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Physics marks:- ");
        int physics = sc.nextInt();
        System.out.print("Enter your Chemistry marks:- ");
        int chemistry = sc.nextInt();
        System.out.print("Enter your Bilogy marks:- ");
        int biology = sc.nextInt();
        System.out.print("Ener your mathematics marks:- ");
        int mathematics = sc.nextInt();
        System.out.print("Enter your english marks:- ");
        int english = sc.nextInt();
        float percentage = ((physics + chemistry + biology + mathematics + english)*100)/500.0f;
        System.out.println("percentage:- ");
        System.out.println(percentage);
    }
}
