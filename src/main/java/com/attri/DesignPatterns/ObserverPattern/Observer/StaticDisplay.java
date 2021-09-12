package com.attri.DesignPatterns.ObserverPattern.Observer;

import com.attri.DesignPatterns.ObserverPattern.Observable.WeatherData;

public class StaticDisplay implements Observer, DisplayElement{

    private WeatherData weatherData;

    public StaticDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        this.weatherData.addObserver(this);
    }

    @Override
    public void update(){
        display();
    }

    @Override
    public void display(){
        System.out.println("Avg/Max/Min Temperature = 80.0/80.0/80.0");
    }
}
