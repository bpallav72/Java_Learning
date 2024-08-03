package com.company;

/*
Question6:- create an interface TvRemote and use it to inherit another interface smartTvRemote
Question7:- create a class tv which implements tvRemote interface from Q6
 */
interface TvRemote{
    void power();
}
interface smartTvRemote extends TvRemote{
    void vol();
}
// Question 6
class Tv implements smartTvRemote{
    public void vol(){
        System.out.println("Press volume+ button..");
    }
   // use this method
public void power(){
        System.out.println("Power button");
    }
}
public class cwp_ch11_08_ps6_7 {
    public static void main(String[] args) {
        Tv mr = new Tv();
        mr.vol();
        mr.power();
    }
}
