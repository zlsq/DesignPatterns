package main.java;

import main.java.intf.DisplayElement;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by zlsq on 2017/11/3.
 */
public class CurrentConditionDisplay implements Observer, DisplayElement {
    private Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;

            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            System.out.println(arg);
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("temperature: " + temperature + "humidity: " + humidity);
    }
}
