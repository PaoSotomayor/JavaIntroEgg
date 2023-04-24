/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_JavaIntro;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ejercicio 5 Define una variable de tipo boolean, double y char. 
Guarda información en ellas a través del Scanner.*/
       
        
        Scanner leer = new Scanner(System.in);
        System.out.println ("ingrese un booleano: ");
        boolean banderilla = leer.nextBoolean();
        System.out.println ("Ingrese un precio ");
        double precio = leer.nextDouble();
        System.out.println ("Ingrese una letra ");
        char letra6 = leer.next().charAt(0);
    }
    
}
