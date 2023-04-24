/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio8V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        Scanner leer = new Scanner(System.in);
        int par=0, impar=0, num;
        do{
        System.out.println("Ingrese un número");        
        num = leer.nextInt();
            if (num < 0) {
                continue;               
            }
                        
            if (num%5 == 0) {
                
              break;  
            }
            if (num%2 == 0) {
                par++;
                
            }else {
                impar++;
            }

        }while (num%5 != 0);
       
        if (num%2 == 0) {
                par++;
                
            }else {
                impar++;
            }
            
        
        System.out.println("La cantidad de números impares es " + impar);       
        System.out.println("La cantidad de números pares es " + par);
        System.out.println("La cantidad de números ingresados " + (par + impar ));       
    }
    
}