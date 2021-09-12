package com.attri.DesignPatterns.ObserverPattern.Observable;

import com.attri.DesignPatterns.ObserverPattern.Observer.Observer;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

@Getter
public class WeatherData extends Observable {

    private float temperature, humidity, pressure;
    private List observers;

    public WeatherData(){
        this.temperature = 0;
        this.humidity = 0;
        this.pressure = 0;
        this.observers = new ArrayList();
    }
    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void removeObserver(Observer o){
        this.observers.remove(o);
    }

    public void notifyObservers(){
        for(Iterator i = this.observers.iterator(); i.hasNext(); ){
            Observer observer = (Observer)i.next();
            observer.update();
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

}
