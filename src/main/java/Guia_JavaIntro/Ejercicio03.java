/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_JavaIntro;

/**
 *
 * @author user
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*ejercicio 3. Define variables donde puedas alojar los resultados y prueba usar dos 
operadores de cada tipo*/
        
    int numero1 = 5;
    int numero2 = 3;
        int suma = numero1+numero2;
        
        System.out.println ("resultado suma: " + suma);
            
        double division = numero1/numero2;
        System.out.println ("resultado division: " + division);
        
        boolean banderita = numero2<numero1;
        System.out.println ("resultado: " + banderita);
        
        numero1++;
        System.out.println ("resultado: " + numero1);
    }
    
}
