package com.attri.DesignPatterns.StartegyPattern.Duck;

import com.attri.DesignPatterns.StartegyPattern.FlyBehaviour.FlyWithWings;
import com.attri.DesignPatterns.StartegyPattern.QuackBehaviour.Quack;

public class MallardDuck extends Duck{

    public MallardDuck(){
        flyBehaviour = new FlyWithWings();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.print("I'm a Mallard Duck !!");
    }
}
