/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;
import java.util.Scanner;//Importar para guardar valores en las variables
/**
 *
 * @author Diego
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//Instaciar para usar Scanner
        //Tipo de datos primitivos
        int entero;
        float decimal;
        char caracter;
        boolean decision = false;
        //Datos de tipo no primitivos
        Integer numero = null;
        String palabra = "Hola que tal";
        //Constante
        final int valor = 15;//Agregar "final" al inicio de una variable
        System.out.println("Defina valor: ");
        caracter = entrada.next().charAt(0);
        System.out.println("El valor es: " + caracter);
    }
}
