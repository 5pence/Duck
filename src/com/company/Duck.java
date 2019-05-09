package com.company;

public abstract class Duck {

    FlyBehaviour flyBehaviour;
    Quackbehaviour quackbehaviour;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackbehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackbehaviour(Quackbehaviour quackbehaviour) {
        this.quackbehaviour = quackbehaviour;
    }
}
