/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObserverWeather2;

/**
 *
 * @author User
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData=new WeatherData();
        CurrentConditionsDisplay currentConditions= new CurrentConditionsDisplay(weatherData);
        
        weatherData.setMeasurements(80, 65,30.4f);
        weatherData.setMeasurements(82, 75,29.2f);
        weatherData.setMeasurements(78, 90,29.2f);
        
    }
}
