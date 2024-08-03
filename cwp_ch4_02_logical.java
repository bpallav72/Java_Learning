package com.company;

public class cwp_ch4_02_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND" );
    boolean a = true;
    boolean b = true;
    boolean c = false;
    if (a && b && c)
    {
        System.out.println("yes");
    }
    else
    {
        System.out.println("no");
    }
    //output no
        System.out.println("For Logical OR");
    boolean a1 = true;
    boolean b1 = true;
      if(a || b )
      {
          System.out.println("y");
      }
      else
      {
          System.out.println("no");
      }

        System.out.println("For Logical NOT");
        System.out.println("Noy(a) is ");
        System.out.println(!a);
        System.out.println("NOT(b) is ");
        System.out.println(!b);
    }
}
