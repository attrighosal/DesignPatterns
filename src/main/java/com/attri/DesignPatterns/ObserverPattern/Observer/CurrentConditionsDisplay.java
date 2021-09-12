package com.attri.DesignPatterns.ObserverPattern.Observer;

import com.attri.DesignPatterns.ObserverPattern.Observable.WeatherData;

public class CurrentConditionsDisplay implements Observer,DisplayElement {

    private float temperature, humidity;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(){
        this.temperature = weatherData.getTemperature();
        this.humidity = weatherData.getHumidity();
        display();
    }

    @Override
    public void display(){
        System.out.println("Current Conditions are : Temperature = "+this.temperature+", Humidity = "+this.humidity);
    }
}
