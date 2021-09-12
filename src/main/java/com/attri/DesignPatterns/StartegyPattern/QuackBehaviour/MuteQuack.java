package com.attri.DesignPatterns.StartegyPattern.QuackBehaviour;

public class MuteQuack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.print("Can't Quack");
    }
}
