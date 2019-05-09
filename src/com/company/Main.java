package com.company;

public class Main {

    public static void main(String[] args) {
	    Duck mallardDuck = new MallardDuck();
	    mallardDuck.performQuack();
	    mallardDuck.performFly();

	    Duck model = new ModelDuck();
	    model.performFly();
	    model.setFlyBehaviour(new FlyRocketPowered());
	    model.performFly();
    }
}

