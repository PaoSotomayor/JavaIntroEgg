/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio16 {

/*Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al usuario un 
numero a buscar en el vector. El programa mostrará donde se encuentra el numero y si se encuentra repetido
 */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n, contador = 0, num;
        
        System.out.println("Ingrese el tamaño de su vector: ");
        n = leer.nextInt();
        int[] vectorAleatorio = new int[n];
        
        for (int i = 0; i < vectorAleatorio.length; i++) {
            vectorAleatorio[i] += (Math.random() * 10+1); 
           System.out.println(""+vectorAleatorio[i]);            
        }        
        System.out.println("Ingrese un numero a buscar: ");
        num = leer.nextInt();
        
        for (int i = 0; i < vectorAleatorio.length; i++) {
            if (vectorAleatorio[i] == num) {
                contador++;
                System.out.println("EL numero "+num+" se ha encontrado en la posicion: " + i+1);
                
            }
        }      
        if (contador == 0) {
            System.out.println("No se ha encontrado el numero");
        }else{
            System.out.println("EL numero " + num + " se ha encontrado " + contador + " veces.");
        }
          }
     }


