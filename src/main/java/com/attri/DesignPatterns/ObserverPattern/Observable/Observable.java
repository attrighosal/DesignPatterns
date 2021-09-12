package com.attri.DesignPatterns.ObserverPattern.Observable;

import com.attri.DesignPatterns.ObserverPattern.Observer.Observer;

public interface Observable {

    void addObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
