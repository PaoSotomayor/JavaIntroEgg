/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author user
 */
public class Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector[] = new int[5]; // Le ponemos la dimension al vector
        
        for (int i = 0; i < 5; i++) {
         
            vector[i] = 6; // Le asignamos a cada posicion del vector el numero 6 
            
        }
        
        for (int i = 0; i < 5; i++) {
            
            // Usamos la i para pasar por todos los elementos y mostrarlos
            System.out.print("[" + vector[i] + "]");
            
        }
        
        System.out.println(" ");
        
        
    }

}