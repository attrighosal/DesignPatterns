package com.attri.DesignPatterns.ObserverPattern;

import com.attri.DesignPatterns.ObserverPattern.Observable.WeatherData;
import com.attri.DesignPatterns.ObserverPattern.Observer.CurrentConditionsDisplay;
import com.attri.DesignPatterns.ObserverPattern.Observer.StaticDisplay;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class WeatherDataTest {

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
    public void testOneUpdate() {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);

        weatherData.setMeasurements(80, 25, 30.4f);

        Assertions.assertEquals("Current Conditions are : Temperature = 80.0, Humidity = 25.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\n", systemOutContent.toString());
    }

    @Test
    public void testMultipleUpdates() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);

        weatherData.setMeasurements(80, 25, 30.4f);
        Assertions.assertEquals("Current Conditions are : Temperature = 80.0, Humidity = 25.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\n", systemOutContent.toString());
        systemOutContent.reset();

        weatherData.setMeasurements(82, 70, 29.2f);
        Assertions.assertEquals("Current Conditions are : Temperature = 82.0, Humidity = 70.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\n", systemOutContent.toString());
        systemOutContent.reset();

        weatherData.setMeasurements(78, 90, 29.2f);
        Assertions.assertEquals("Current Conditions are : Temperature = 78.0, Humidity = 90.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\n", systemOutContent.toString());
        systemOutContent.reset();
    }

    @Test
    public void testMultipleUpdatesAtOnce() {

        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StaticDisplay staticDisplay = new StaticDisplay(weatherData);

        weatherData.setMeasurements(80, 25, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        Assertions.assertEquals("Current Conditions are : Temperature = 80.0, Humidity = 25.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\nCurrent Conditions are : Temperature = 82.0, Humidity = 70.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\nCurrent Conditions are : Temperature = 78.0, Humidity = 90.0\nAvg/Max/Min Temperature = 80.0/80.0/80.0\n", systemOutContent.toString());

    }
}
