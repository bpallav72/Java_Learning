package com.company;

public class cwp_ch7_02_calmeth {
     int logic(int x , int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else {
            z = (x+y)*5;
        }
        return z;
    }
    public static void main(String[] args) {
        int a = 8;
        int b = 9;
        int c;
        // method invocation using object creation
        cwp_ch7_02_calmeth obj = new cwp_ch7_02_calmeth();
        c = obj.logic(a, b);
        System.out.println(a +" " + b); // 8 9
        System.out.println(c); // 85
        int a1 = 34;
        int b1 = 44;
        int c1;
        c1 = obj.logic(a1 , b1);
        System.out.println(c1); // 390
    }

}



