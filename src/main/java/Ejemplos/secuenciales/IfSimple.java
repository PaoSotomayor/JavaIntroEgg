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
public class IfSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la edad del usuario");
        int edad = leer.nextInt();
        
        if(edad > 18){
            
            System.out.println("Es mayor de edad");
            
            
        }
        
        
        
        
        
    }

}