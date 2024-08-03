package com.company;

/*
create a class cylinder and use constructor to set its radius height
 */
class cylinder2{
   private int radius;
    private int height;

    public cylinder2(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }
    public void displaycylinder(){
        System.out.println("Radius of cylinder: " + radius);
        System.out.println("Height of cylinder: " + height);
    }
}
public class cwp_ch9_ps3 {
    public static void main(String[] args) {
        cylinder2 mycylinder = new cylinder2(9,12);
        mycylinder.displaycylinder();
        //System.out.println(mycylinder.radius);
        //System.out.println(mycylinder.height);
    }
}
