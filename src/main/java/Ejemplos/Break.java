/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author user
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {

            if (i == 4) {

                break; // El break cuando se encuentra el 4, corta el for y no sigue

            }

            System.out.println("El numero es " + i);

        }
    }
    
}
