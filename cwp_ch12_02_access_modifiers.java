package com.company;

class c1{
    public int x=45;
    protected int y = 45;
    int z =6;
    private int a =78;
    // create method to print modifier in class
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}
class c2 extends c1{
void method2(){
   System.out.println(x);
    System.out.println(y);
   System.out.println(z);  // default modifier allowed in same package subclass
    // System.out.println(a);
}
}
class c3{

}

public class cwp_ch12_02_access_modifiers {
    public static void main(String[] args) {
        c1 c = new c1();
       // c.meth1();

        // create package for print method
      //  System.out.println(c.x); // package non subclass allowed public modifier
        //System.out.println(c.y); // packge non subclass allowed protected modifier
        //System.out.println(c.z); // package non subclass allowed degault modifier
       // System.out.println(c.a); // a has private acees modifier, private modifier not allowed in package

        // create subclass object
        c2 c2 = new c2();
        c2.method2();
    }
}
