package com.exemple.model;

public class Chat extends Animal
{
    public Chat()
    {
        super();
    }
    public Chat(String name, int age) {
        super(name, age);
    }


    //Redefinition : modifier la logique
    @Override
    public void manger(){
        System.out.println("Le chat mange");
    }

    //Surcharge
    public void manger(String aliment) {
        System.out.println("le chat mange : " + aliment);
    }
}
