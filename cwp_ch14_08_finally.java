package com.company;

public class cwp_ch14_08_finally {
    public static int greet() {

        try {
            int a = 6;
            int b = 0;
            int c = a / b;
           return c;
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            System.out.println("cleaning up resources...This is the end of function");
        }
        return 0;
    }

    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
        //-------------------

        int a = 9;
        int b = 8;
        while(true){
            try{
                System.out.println(a/b);
            }
            catch(Exception e){
                System.out.println(e);
                break;
            }
            finally{
                System.out.println("I am finally for value of b = " + b);
            }
            b--;
        }
        //*----------------*-------------------*------------
        try{
            System.out.println(50/10);
        }
        finally {
            System.out.println("Yes this is finally");
        }
    }
}
