/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;
import Subject.*;
/**
 *
 * @author Diego
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private Subject weatherData;
    
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    
    @Override
    public void update(float temperature, float humidity, float pressure, float aqi){
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    
    @Override
    public void display(){
        System.out.println("Condiciones actuales: ");
        System.out.println("Temperatura: " + temperature + "°C");
        System.out.println("Humedad: " + humidity + "%");
    }
}
