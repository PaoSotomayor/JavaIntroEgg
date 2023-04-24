/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos.secuenciales;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Nos interesa que el usuario ingrese un numero y muestre el
        // equivalente en numero romano
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        switch (numero) {
            case 1 -> System.out.println("En romano es I");
            case 2 -> System.out.println("En romano es II");
            case 3 -> System.out.println("En romano es III");
            case 4 -> System.out.println("En romano es IV");
            case 5 -> System.out.println("En romano es V");
            default -> System.out.println("El numero ingresado no está todavia en nuestro programa");
        }

    }

}
