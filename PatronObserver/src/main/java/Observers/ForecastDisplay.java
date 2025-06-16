/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;
/**
 *
 * @author Diego
 */
public class ForecastDisplay implements Observer, DisplayElement{
    private float pressure;
    private float presionAnterior = pressure;
    
    @Override
    public void update(float temperature, float humidity, float pressure, float aqi){
        this.presionAnterior = this.pressure;
        this.pressure = pressure;
        display();
    }
    
    @Override
    public void display(){
       if (pressure > presionAnterior){
            System.out.println("Pronóstico: Mejorando el tiempo");
        }
        if (pressure == presionAnterior){
            System.out.println("Pronóstico: Sin cambios");
        }
        if (pressure < presionAnterior){
            System.out.println("Pronóstico: Empeorando el tiempo");
        } 
    }
}
