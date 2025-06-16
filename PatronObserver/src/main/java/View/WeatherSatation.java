/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;
import javax.swing.*;
import Observers.*;
import Subject.*;
import java.awt.event.*;
/**
 *
 * @author Diego
 */
public class WeatherSatation extends JFrame{
    
    private float temperature;
    private float humidity;
    private float pressure;
    private float aqi;
    WeatherData weatherData = new WeatherData();
    CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);
    
    public WeatherSatation(){
        setSize(1100, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Estación Meteorologica");
        setLocationRelativeTo(null);
        view();
    }
    private void view(){
            JPanel panel = new JPanel();
            panel.setLayout(null);
            this.getContentPane().add(panel);
            
            JLabel controles = new JLabel("Controles");
            controles.setBounds(20, 10, 80, 20);
            panel.add(controles);
            
            JLabel temperatura = new JLabel("Temperatura (°C):");
            temperatura.setBounds(50, 40, 120, 20);
            panel.add(temperatura);
            
            JLabel humedad = new JLabel("Humedad (%):");
            humedad.setBounds(71, 70, 100, 20);
            panel.add(humedad);
            
            JLabel presion = new JLabel("Presión (hPa):");
            presion.setBounds(70, 100, 100, 20);
            panel.add(presion);
            
            JLabel calidadAire = new JLabel("Calidad Aire (AQI):");
            calidadAire.setBounds(47, 130, 140, 20);
            panel.add(calidadAire);
            
            JLabel visualizaciones = new JLabel("Visualizaciones");
            visualizaciones.setBounds(20, 170, 100, 20);
            panel.add(visualizaciones);
            
            JSpinner  temperaturaSpinner = new JSpinner ();
            temperaturaSpinner.setBounds(160, 40, 650, 20);
            panel.add(temperaturaSpinner);
            
            JSpinner  humedadSpinner = new JSpinner ();
            humedadSpinner.setBounds(160, 70, 650, 20);
            panel.add(humedadSpinner);
            
            JSpinner  presionSpinner = new JSpinner ();
            presionSpinner.setBounds(160, 100, 650, 20);
            panel.add(presionSpinner);
            
            JSpinner  calidadAireSpinner = new JSpinner ();
            calidadAireSpinner.setBounds(160, 130, 650, 20);
            panel.add(calidadAireSpinner);
            
            JButton actualizar = new JButton("Actualizar datos");
            actualizar.setBounds(900, 70, 150, 40);
            panel.add(actualizar);
            
            
            ActionListener actualizarDatos = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
            temperature = ((Double) temperaturaSpinner.getValue()).floatValue();
            humidity = ((Double) humedadSpinner.getValue()).floatValue();
            pressure = ((Double) presionSpinner.getValue()).floatValue();
            aqi = ((Double ) calidadAireSpinner.getValue()).floatValue();
    }            
            };
            actualizar.addActionListener(actualizarDatos);
            
            JButton agregarCondiciones = new JButton("Agregar Condiciones Actuales");
            agregarCondiciones.setBounds(860, 230, 205, 40);
            panel.add(agregarCondiciones);
            
            JButton agregarEstadisticas = new JButton("Agregar Estadisticas");
            agregarEstadisticas.setBounds(890, 300, 150, 40);
            panel.add(agregarEstadisticas);
            
            JButton agregarPronostico = new JButton("Agregar Pronóstico");
            agregarPronostico.setBounds(890, 370, 150, 40);
            panel.add(agregarPronostico);
            
            JButton agregarCalidad = new JButton("Agregar Calidad Aire");
            agregarCalidad.setBounds(890, 440, 150, 40);
            panel.add(agregarCalidad);
        }
    }