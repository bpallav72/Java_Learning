package com.company;

/*
create a class Rectangle and use inheritance to create another class cuboid.
 */
class Rectangle2{
    private double length,width;
// constructor
    public Rectangle2(double length, double width) {
        this.length = length;
        this.width = width;
    }
// getter for length
    public double getLength() {
        return length;
    }
// setter for length
    public void setLength(double length) {
        this.length = length;
    }
// Getter fir width
    public double getWidth() {
        return width;
    }
// setter for width
    public void setWidth(double width) {
        this.width = width;
    }
    // Method of calculate area
    public double area(){
        return length*width;
    }
    public String printmethod(){
        return "Rectangle[length=" + length+", width=" + width + "]";
    }
  }

class Cuboid extends Rectangle2 {
    private double height;
// constructor
    public Cuboid(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }
// Getter for height
    public double getHeight() {
        return height;
    }
// Setter for height
    public void setHeight(double height) {
        this.height = height;
    }
    // calculate volume
    public double volume(){
        return  getLength() * getWidth() * height;
    }
    @Override
    public String printmethod(){
       return "Cuboid[length=" + getLength() + ", width=" + getWidth() + " , height=" + height + "]";
    }
}
public class cwp_ch10_08_ps2 {
    public static void main(String[] args) {
        Rectangle2 rect = new Rectangle2(5,3);
        System.out.println("Rectangle: " + rect);
        System.out.println("Area of Rectangle: " + rect.area());
        Cuboid cub = new Cuboid(4,5,2);
        System.out.println("Volume of cuboid: " + cub.volume());
    }
}
