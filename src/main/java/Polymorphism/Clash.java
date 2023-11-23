package com.mycompany.polymorphism;

 class Clash extends Name {
    
      Clash(String name){
        super(name);
    }

    void action1(){
        System.out.println(name+" got a sword");
    }

    void action2(){
        System.out.println(name+" punching using knuckles");
    }

}