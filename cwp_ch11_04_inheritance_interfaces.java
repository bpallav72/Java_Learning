package com.company;

interface sampleInterface{
    void meth1();
    void meth2();
}
//class chilsampleInterface extends sampleInterface{ // A interface not allowed inherit to class
//    void meth3();
//    void meth4();
//}
interface childsampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class mySampleClass implements childsampleInterface{
   public void meth1() {
        System.out.println("Method1 ");
    }

    public void meth2() {
        System.out.println("Method2 ");
    }
    public void meth3(){
        System.out.println("Method3 ");
    }
    public void meth4(){
        System.out.println("Method4 ");
    }
}
public class cwp_ch11_04_inheritance_interfaces {
    public static void main(String[] args) {
    mySampleClass msc = new mySampleClass();
    msc.meth1();
    msc.meth2();
    msc.meth3();
    msc.meth3();
    }
}
