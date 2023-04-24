/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio13ex {

    /*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en uno y 
    termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1 
    12 
    123

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la altura de la escalera: ");
        int altura = leer.nextInt();
        String escalera = "";
        
        for (int i = 1; i < altura+1; i++) {
            escalera=escalera.concat(Integer.toString(i));
            System.out.println(escalera);           
        }
    }
    
}