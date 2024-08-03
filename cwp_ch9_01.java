package com.company;

class MyEmployee{
    private int id;
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String n){
       this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }
}
public class cwp_ch9_01 {
    public static void main(String[] args) {
    MyEmployee Akash = new MyEmployee();
    Akash.setName("Akash Singh");
    Akash.setId(420);
        System.out.println(Akash.getName());
        System.out.println(Akash.getId());

    }
}
