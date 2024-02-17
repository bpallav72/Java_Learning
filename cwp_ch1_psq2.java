/* write a program to calculate a cgpa using marks of three subject(out of 100)*/
import java.util.Scanner;
public class cwp_ch1_psq2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter subject1 marks:- ");
        float subject1 = sc.nextFloat();
        System.out.print("ener subject2 marks:- ");
        float subject2 = sc.nextFloat();
        System.out.print("Enter subject3 marks:- ");
        float subject3 = sc.nextFloat();
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println("Marks in CGPA is :- ");
        System.out.println(cgpa);

    }
}
