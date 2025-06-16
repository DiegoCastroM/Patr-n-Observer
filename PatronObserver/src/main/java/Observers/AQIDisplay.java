/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observers;

/**
 *
 * @author Diego
 */
public class AQIDisplay implements Observer, DisplayElement{
    private float aqi;
     
    @Override
    public void update(float temperature, float humidity, float pressure, float aqi){
        this.aqi = aqi;
        display();
    }
    
    @Override
    public void display(){
        if (aqi>=0 && aqi<=50){
            System.out.println("Buena");
        }
        if (aqi>=51 && aqi<=100){
            System.out.println("Moderada");
        }
        if (aqi>=101 && aqi<=150){
            System.out.println("Poco saludable");
        }
        if (aqi>=151 && aqi<=200){
            System.out.println("Insalubre");
        }
        if (aqi>=201 && aqi<=300){
            System.out.println("Muy insalubre");
        }
        if (aqi>=301){
            System.out.println("Peligrosa");
        }
    }
}
