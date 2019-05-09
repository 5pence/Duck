package com.company;

public class MuteQuack implements Quackbehaviour {

    @Override
    public void quack() {
        System.out.println("<<< silence >>>");
    }
}
