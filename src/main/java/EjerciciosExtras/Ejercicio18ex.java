/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/*Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N, 
con los valores ingresados por el usuario.
 */
public class Ejercicio18ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Ingrese el tamano de vector");
           Scanner leer = new Scanner(System.in);
      int n= leer.nextInt();
        int suma=0;      
        int[] vector=new int[n];
        
        for(int i=0;i<vector.length;i++){
        
            
            
            System.out.println("Ingrese el valor del posicion "+i);
            
            int valor= leer.nextInt();
                  vector[i]=valor;      
            suma+=valor;
    }
}    
}
