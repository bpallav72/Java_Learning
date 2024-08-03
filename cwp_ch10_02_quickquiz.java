package com.company;

/*
create a class animal and derive another class dog from it
 */
class Animal{
    String name;
    int legs;
    String eat;
    public String getName() {
        return name;
    }
        public void setName(String name){
            this.name = name;
        }
        public int getLegs(){
        return legs;
        }
        public void setLegs(int legs){
        this.legs = legs;
        }
        public String getEat(){
        return eat;
        }
        public void setEat(String eat){
        this.eat = eat;
        }
}
class Dog extends Animal{
    String barks;
    String speed;

    public String getBarks() {
        return barks;
    }

    public void setBarks(String barks) {
        this.barks = barks;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }
}
public class cwp_ch10_02_quickquiz {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setName("Rony");
        System.out.println(a.getName());

        a.setLegs(4);
        System.out.println(a.getLegs());

        a.setEat("The doggy eats all type of meat");
        System.out.println(a.getEat());

        Dog d = new Dog();
        d.setName("Leopard");
        System.out.println(d.getName());
        d.setLegs(2);
        System.out.println(d.getLegs());
        d.setEat("the cheetah is fond of eating deers");
        System.out.println(d.getEat());
    }
}
