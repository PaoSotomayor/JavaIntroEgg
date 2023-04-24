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
public class IfAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Nos interesa que el usuario ingrese un numero y saber si es 0 o par o impar
        
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero = leer.nextInt();

        if (numero == 0) {

            System.out.println("Es cero");

        } else if(numero % 2 == 0) {

            System.out.println("Es par");

        }else{
            
            System.out.println("Es impar");
            
        }

    }

}