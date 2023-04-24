/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en 
minúsculas.
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("Introduce una frase: ");
        frase = leer.nextLine();
        
        System.out.println (frase.toUpperCase());
        System.out.println ( frase.toLowerCase());
        
    }
    
}
