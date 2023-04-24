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
public class Ejercicio8ex {

    /*Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe detener la 
    lectura y mostrar la cantidad de números leídos, la cantidad de números pares y la cantidad de números 
    impares. Al igual que en el ejercicio anterior los números negativos no deben sumarse. Nota: recordar el 
    uso de la sentencia break
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par=0, impar=0, num, cont  = 0;
        do{
        System.out.println("Ingrese un número");        
        num = leer.nextInt();
            if (num < 0) {
                continue;               
            }
                        
            if (num%5 == 0) {
                cont++;
              break;  
            }
            if (num%2 == 0) {
                par++;
                
            }else {
                impar++;
            }

        }while (num%5 != 0);
        
        System.out.println("La cantidad de números impares es " + impar);       
        System.out.println("La cantidad de números pares es " + par);
        System.out.println("La cantidad de números ingresados " + (par + impar + cont));       
    }
    
}
