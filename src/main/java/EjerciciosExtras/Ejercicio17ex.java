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
public class Ejercicio17ex {

    /*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por 
    parámetro para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
     */
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
      Scanner leer = new Scanner(System.in);
      int num=leer.nextInt();
      
        System.out.println(esPrimo(num));
        
        
    }
    
    public static boolean esPrimo(int num){
    boolean primo;
    primo=true;    
    
    if (num<=1){
        
        
    return false;    
        
    }
    
    for (int i=2; i<= Math.sqrt(num); i++){
        
        if(num%i==0){
            
            return false;
            
        }
    
    }
    
    return primo;
    } 
    
}