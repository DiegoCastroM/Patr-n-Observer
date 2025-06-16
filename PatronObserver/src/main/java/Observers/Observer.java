/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Observers;

/**
 *
 * @author Diego
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure, float aqi);
}
