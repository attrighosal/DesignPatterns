package com.attri.DesignPatterns.StrategyPattern;

import com.attri.DesignPatterns.StartegyPattern.Duck.Duck;
import com.attri.DesignPatterns.StartegyPattern.Duck.MallardDuck;
import com.attri.DesignPatterns.StartegyPattern.Duck.ModelDuck;
import com.attri.DesignPatterns.StartegyPattern.FlyBehaviour.FlyRocketPowered;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class DuckTest {

    private PrintStream originalSystemOut;
    private ByteArrayOutputStream systemOutContent;

    @BeforeEach
    void redirectSystemOutStream() {

        originalSystemOut = System.out;
        systemOutContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(systemOutContent));
    }

    @AfterEach
    void restoreSystemOutStream() {
        System.setOut(originalSystemOut);
    }

    @Test
    public void testDisplay(){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        Assertions.assertEquals("I'm a Mallard Duck !!",systemOutContent.toString());
    }

    @Test
    public void testFly(){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        Assertions.assertEquals("Flying with wings !!",systemOutContent.toString());
    }

    @Test
    public void testQuack(){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        Assertions.assertEquals("Quack !!",systemOutContent.toString());
    }

    @Test
    public void testSwim(){

        Duck mallardDuck = new MallardDuck();
        mallardDuck.swim();
        Assertions.assertEquals("Swimming !!",systemOutContent.toString());
    }

    @Test
    public void testDynamicFlyBehaviour(){

        Duck modelDuck = new ModelDuck();
        modelDuck.performFly();
        Assertions.assertEquals("Can't Fly !!",systemOutContent.toString());
        systemOutContent.reset();

        modelDuck.setFlyBehaviour(new FlyRocketPowered());
        modelDuck.performFly();
        Assertions.assertEquals("Flying with a Rocket !!",systemOutContent.toString());
    }

}
