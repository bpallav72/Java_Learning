package com.company;

/*
use 1 to calculate surface area and volume of the cylinder
 */
class cylinder1{
    int radius;
    int height;

    public int getR() {
        return radius;
    }

    public void setR(int r) {
        radius = r;
    }

    public int getH() {
        return height;
    }

    public void setH(int h) {
        height = h;
    }
    public double surfaceArea(){
        return 2*3.142*radius*radius + 2*3.142*radius*height;
    }
    public double volume(){
        return 3.142*radius*radius*height;
    }
}
public class cwp_ch9_ps2 {
    public static void main(String[] args) {
        cylinder1 mycylinder = new cylinder1();
        mycylinder.setR(9);
        System.out.println(mycylinder.getR());
        mycylinder.setH(12);
        System.out.println(mycylinder.getH());
        System.out.println("Cylinder of surface area: " + mycylinder.surfaceArea());
        System.out.println("Cylinder of volume: " + mycylinder.volume());
    }
}
