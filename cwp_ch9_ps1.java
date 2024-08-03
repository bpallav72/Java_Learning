package com.company;

/*
create a class cylinder and use getters and setters to set its radius and height
 */
class cylinder{
    private int radius;
    private int height;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int r) {
        this.radius = r;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int h) {
        this.height = h;
    }
   /* public void cylinder(){
        System.out.println(radius);
        System.out.println(height);
    }

    */
}
public class cwp_ch9_ps1 {
    public static void main(String[] args) {

        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(13);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
    }
}
