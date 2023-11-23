package com.mycompany.abstraction;



   public class Guns extends Name{

    Guns(String name){
        super(name);
    }

    void action1(){
        System.out.println(name+" bring a pistol");
    }

    void action2(){
        System.out.println(name+" is Angry and starts raging");
    }
}
    