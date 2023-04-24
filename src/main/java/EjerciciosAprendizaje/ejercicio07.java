/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio07 {

    /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa pondrá un 
    mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar la función equals() en Java
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase, frase2;
        System.out.print("Introduce una frase o palabra: ");
        frase = leer.nextLine();
        
        frase2 = "eureka";

        if (frase.equalsIgnoreCase(frase2)) {                       
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }
}