package com.attri.DesignPatterns.StartegyPattern.FlyBehaviour;

public class FlyNoWay implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.print("Can't Fly !!");
    }
}
