import java.util.Scanner;
public class cwp_ch1_03_takinginput {
    public static void main(String[] args) {
        System.out.println("taking input from the user ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value 1 :- ");
        // int a = sc.nextInt();
        float c = sc.nextFloat();
        System.out.print("enter value 2 :- ");
        //int b = sc.nextInt();
        float d =  sc.nextFloat();
        //int sum = a+b;
        float mul = c * d;
        System.out.println(mul);

        //System.out.print("the sum of these number :- ");
        //System.out.println(sum);
         //boolean b1 = sc.hasNextInt();
        //System.out.println(b1);
        System.out.println("enter first number;- ");
        int j = sc.nextInt();
        System.out.println("enter second number:- ");
        int k = sc.nextInt();
        int mul2 = j * k;
        System.out.println(mul2);



    }
}
