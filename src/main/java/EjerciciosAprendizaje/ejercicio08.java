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
public class ejercicio08 {

    /*Realizar un programa que solo permita introducir frases o palabras de 8 de largo. 
    Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por 
    pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. 
    Nota: investigar la función Lenght() en Java
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Digita una palabra de 8 letras:");
        String frase = leer.nextLine();
        
        if(frase.length() == 8 ){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    }
