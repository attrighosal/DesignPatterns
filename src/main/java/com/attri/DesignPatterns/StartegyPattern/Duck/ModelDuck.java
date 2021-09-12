package com.attri.DesignPatterns.StartegyPattern.Duck;

import com.attri.DesignPatterns.StartegyPattern.FlyBehaviour.FlyNoWay;
import com.attri.DesignPatterns.StartegyPattern.QuackBehaviour.Quack;

public class ModelDuck extends Duck{

    public ModelDuck(){
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.print("I'm a Model Duck");
    }
}
