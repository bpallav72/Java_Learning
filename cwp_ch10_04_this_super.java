package com.company;

class Ekclass{
    int a;
    public int getA(){
        return a;
    }
    Ekclass(int a){ // constructor
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}
class Doclass extends Ekclass{
    Doclass(int c){  // constructor
        super(c);
        System.out.println("I am a constructor");
    }
}
public class cwp_ch10_04_this_super {
    public static void main(String[] args) {
        Ekclass e = new Ekclass(65);
        System.out.println(e.getA());
        Doclass d = new Doclass(5);

    }
}
