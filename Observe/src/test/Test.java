package test;

import main.java.CurrentConditionDisplay;
import main.java.WeatherData;

/**
 * Created by zlsq on 2017/11/3.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new CurrentConditionDisplay(weatherData);
        weatherData.setMeasurements(2.0f, 1.0f, 3.0f);

    }
}
