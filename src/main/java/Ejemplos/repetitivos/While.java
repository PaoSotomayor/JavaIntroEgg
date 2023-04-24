/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos.repetitivos;

import Ejemplos.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nos interesa validar si una nota esta entre 0 y 10
        // si no está pedirsela de nuevo
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un nota");
        int nota = leer.nextInt();

        while (nota < 0 || nota > 10) {

            System.out.println("Nota incorrecta, ingrese la nota de nuevo");
            nota = leer.nextInt();

        }
        
        System.out.println("Nota correcta");

    }

}