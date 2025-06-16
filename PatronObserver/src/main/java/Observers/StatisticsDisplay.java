/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.*;
/**
 *
 * @author Diego
 */
public class StatisticsDisplay implements Observer, DisplayElement{
    private float temperature;
    private float suma_temp;
    private int lecturas;
    private float maxTemp;
    private float minTemp;
    private ArrayList<Float> registro;

    public StatisticsDisplay() {
        registro = new ArrayList();
    }
    
    
    
    @Override
    public void update(float temperature, float humidity, float pressure, float aqi){
        this.temperature = temperature;
        registro.add(temperature);
        suma_temp = registro.stream().reduce(0f, Float::sum);
        lecturas = registro.size();
        maxTemp = Collections.max(registro);
        minTemp = Collections.min(registro);
        display();
    }
    
    
    @Override
    public void display(){
        System.out.println("Prom: " + suma_temp/lecturas + "°C" + "|" + "Max: " + maxTemp + "°C" + "|" + "Min: " + minTemp + "°C");
    }
}
