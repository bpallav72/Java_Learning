/* write a java program to convert kilometers to miles. */
import java.util.Scanner;
public class cwp_ch1_psq4 {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("Enter kilometers:- ");
     double kilometer = in.nextDouble();
     // we know that 1 kilometer = 0.621371 miles
     double miles = kilometer * 0.621371;
        System.out.println(miles + " miles");

    }
}
