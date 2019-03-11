/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather;

/**
 *
 * @author User
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private float pressure;
    private WeatherData weatherData;

    public CurrentConditionsDisplay(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: "+ temperature+"C degree and "+ humidity+ "% humidity "+"pressure "+pressure);
    }
    @Override
    public void update (float temperature,float humidity,float pressure){
    this.temperature=temperature;
    this.humidity=humidity;
    this.pressure=pressure;
    display();
    }
}

