/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Random;

/**
 *
 * @author user
 */
public class Ejercicio20ex {

    /*Crear una función rellene un vector con números aleatorios, pasándole un arreglo por parámetro. 
    Después haremos otra función o procedimiento que imprima el vector.
     */
    public static void main(String[] args) {
       
  int[] vector = new int[10]; 
        llenarVector(vector); 
        imprimirVector(vector); 
    }
    
    public static void llenarVector(int[] vector) {
        Random rand = new Random(); 
        for(int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100); 
        }
    }
    
    public static void imprimirVector(int[] vector) {
    
        for(int i=0;i < vector.length;i++ )
        System.out.print(vector[i]+",");
        
    }
}