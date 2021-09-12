package com.attri.DesignPatterns.StartegyPattern.Duck;

import com.attri.DesignPatterns.StartegyPattern.FlyBehaviour.FlyBehaviour;
import com.attri.DesignPatterns.StartegyPattern.QuackBehaviour.QuackBehaviour;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@NoArgsConstructor
public abstract class Duck {

    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void swim(){
        System.out.print("Swimming !!");
    }
}
