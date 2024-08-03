package com.company;

public class cwp_ch7_01_mthods {
      static int logic(int x , int y){
          int z;
          if(x>y){
              z= x+y;
          }
          else {
              z = (x+y)*5;
          }
          x = 566;
         return z;
      }
      public static void main(String[] args) {
       int a = 8;
       int b = 9;
       int c;
       c = logic(a, b);
          System.out.println(a +" " + b);
          System.out.println(c);
          int a1 = 34;
          int b1 = 44;
          int c1;
          c1 = logic(a1 , b1);
          System.out.println(c1);
    }

    }

