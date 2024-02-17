/* write a java program which asks the user to enter his/her name and greats
 them with "Hello <name> have a good day" text */
import java.util.Scanner;
public class cwp_ch1_psq3 {
    public static void main(String[] args) {
        System.out.print("what is your name :- ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");
    }
}
