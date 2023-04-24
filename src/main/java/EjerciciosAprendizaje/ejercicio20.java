/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/*Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus 
filas, sus columnas y sus diagonales son idénticas. Crear un programa que permita introducir un 
cuadrado por teclado y determine si este cuadrado es mágico o no. El programa deberá comprobar que los 
números introducidos son correctos, es decir, están entre el 1 y el 9.
 */
public class ejercicio20 {

public static void main(String[] args) {
        int [] [] mat = new int [3][3];
        int sumaFila = 0;
        int sumaColumna = 0;
        int contador = 0;
           
        Scanner leer = new Scanner (System.in);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(":: NUMEROS DEL 1 AL 9 ::");

                    System.out.println("Ingrese el dato de la posición "+ (1+i)+ " " +(1+j));
                    int dato = leer.nextInt();                    
                    mat[i][j] = dato;   
                   //if (dato < 1 || dato > 9){
                    //System.out.println("Debe ingresar números entre 1 y 9");                        
                }                
            }  
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumaFila += mat[i] [j];
                sumaColumna += mat[j] [i];
                
            }
            if (esIgual (sumaFila, sumaColumna)) {
                contador++;
                if (contador == 3) {
                    System.out.println("::::::::::::"); 
                    System.out.println("Es mágico");  
                    System.out.println("::::::::::::"); 
                    mostrar(mat);
                    
                }else{
                    sumaFila = 0;
                    sumaColumna = 0;
                    
                }
            }else{
                System.out.println("::::::::::::"); 
                System.out.println("No es mágico");
                System.out.println("::::::::::::"); 
                mostrar(mat);
                return;
            }
        }
    }
    private static boolean esIgual (int sumaFila, int sumaColumna) {
        return sumaFila == sumaColumna;
    }
    private static void mostrar(int [] [] mat) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print( String.format(" | %2d", mat[j][i], " | "));
                          
            }
            System.out.println(" | ");
                
            }
        }
    }

