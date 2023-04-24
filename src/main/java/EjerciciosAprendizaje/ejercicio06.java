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
public class ejercicio06 {

    /*Crear un programa que dado un numero determine si es par o impar
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero:");
        int numero = leer.nextInt();
        
        if(numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
    } 
