/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.patronobserver;
import Subject.*;
import Observers.*;
import View.*;
/**
 *
 * @author Diego
 */
public class PatronObserver {

    public static void main(String[] args) {
        WeatherSatation estacionMeteorologica = new WeatherSatation();
        
        estacionMeteorologica.setVisible(true);
        
        /*WeatherData weatherData = new WeatherData();
        
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        ForecastDisplay forecastDisplay = new ForecastDisplay();
        AQIDisplay aqiDisplay = new AQIDisplay();
        AlertSystemDisplay alertSystemDisplay = new AlertSystemDisplay();
        
        alertSystemDisplay.update(34, 65, 30.4f, 134);
        alertSystemDisplay.update(82, 70, 29.2f, 167);
        alertSystemDisplay.update(78, 90, 29.2f, 256);*/
        
        
    }
}
