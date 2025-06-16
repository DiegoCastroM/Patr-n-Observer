/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Subject;
import Subject.Subject;
import Observers.Observer;
import java.util.ArrayList;
/**
 *
 * @author Diego
 */
public class WeatherData implements Subject{
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;
    private float aqi;
    
    public WeatherData(){
        observers = new ArrayList();
    }
    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    @Override
    public void removeObserver(Observer observer){
        int i = observers.indexOf(observer);
        if (i >= 0){
            observers.remove(i);
        }
    }
    @Override
    public void notifyObservers(){
        for (int i = 0; i < observers.size(); i++){
            Observer observer = (Observer)observers.get(i);
            observer.update(temperature, humidity, pressure, aqi);
    }
    }
    
    public void measurementsChanged(){
        notifyObservers();
    }
    
    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
    
}
