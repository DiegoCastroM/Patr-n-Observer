/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Diego
 */
public class AlertSystemDisplay implements Observer, DisplayElement{
    private float temperature;
    private float humidity;
    private float aqi;
    
    @Override
    public void update(float temperature, float humidity, float pressure, float aqi){
        this.temperature = temperature;
        this.humidity = humidity;
        this.aqi = aqi;
        display();
    }
    
    @Override
    public void display(){
        if (temperature > 35){
            System.out.print("¡Alerta! Temperature alta: " + temperature + "|");
        }
        if (humidity > 90){
            System.out.print("¡Alerta! Humedad alta: " + humidity + "|");
        }
        if (aqi > 150){
            System.out.println("¡Alerta! AQI elevado: " + aqi);
        }
    }
}
