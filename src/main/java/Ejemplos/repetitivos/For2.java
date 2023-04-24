/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos.repetitivos;

/**
 *
 * @author user
 */
public class For2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realizar un programa que muestre la cantidad de números 
        // que son múltiplos de 2 o de 3 comprendidos entre 1 y 100. 
        
        int cont2 = 0;
        int cont3 = 0;

        for (int i = 0; i < 100; i++) {

            if (i % 2 == 0) {
                cont2 = cont2 + 1;
            }
            if (i % 3 == 0) {
                cont3 = cont3 + 1;
            }

        }

        System.out.println("La cantidad de multiplos de 2 : " + cont2);
        System.out.println("La cantidad de multiplos de 3 : " + cont3);

    }

}
