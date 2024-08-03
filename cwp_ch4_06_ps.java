package com.company;/* wrie a java program to find out the day of the week given the number [ 1 for Monday,
2 for Tuesday,.........and so on !]
 */
import java.util.Scanner;
public class cwp_ch4_06_ps {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number (1-7):- ");
        int Day = sc.nextInt();
        switch(Day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        } */
// write a java program to find whether a year entered by the user is a leap year or not.
      /*  System.out.println(" Enter the year to be check:- ");
        Scanner sc = new Scanner(System.in);
        int yr = sc.nextInt();
        if(yr%4==0 && yr%100!=0 || yr%400==0 && yr%100==0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not leap year");
        }*/
/* write a java program to find out the type of website from the url
            .com -> Commercial website
            .org -> Organization website
            .in  -> Indian website  */
        Scanner sc = new Scanner(System.in);
        String website = sc.next();
        if(website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(".org")){
            System.out.println("This is an Organizational website");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian website");

        }
    }
}
