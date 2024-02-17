/* write a java program to detect whether a number entered by
the user is integer or not */
import java.util.Scanner;
public class cwp_ch1_psq5 {
    public static void main(String[] args){
        System.out.print("enter your number:- ");
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());
    }
}
