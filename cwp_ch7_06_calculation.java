package com.company;

public class cwp_ch7_06_calculation {
    // By changing the number of arguments passed :


    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return  a*b*c;
    }

    public static void main(String[] args) {

        cwp_ch7_06_calculation obj = new cwp_ch7_06_calculation();
        int c = obj.multiply(5,4);
        int d = obj.multiply(5,4,3);
        System.out.println(c);
        System.out.println(d);

    }
}

