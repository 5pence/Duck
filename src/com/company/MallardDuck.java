package com.company;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackbehaviour = new Quack();
        flyBehaviour = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}
