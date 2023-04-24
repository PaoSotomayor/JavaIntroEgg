/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio18v2 {

/*Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la traspuesta de 
    la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas 
    por columnas (o viceversa).
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int val =4;
        Integer[][] mat = new Integer[val][val];
        //integer se usa para convertir cadena a numero. En este caso esta como clase
    
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
                System.out.println("Ingresa valor en la posicion "+ (1+i)+ " " +(1+j));
                mat[i][j] = leer.nextInt();
            }
        }
         System.out.println(" ");
        System.out.println(" MATRIZ PRINCIPAL ");
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
             System.out.print(String.format(" | %2d", mat[i][j], " | "));
             //preguntar por String.format
            }
            System.out.println(" | ");
        }
        System.out.println(" ");
        System.out.println(" MATRIZ TRANSPUESTA ");
        for (int i = 0 ; i<val ; i++) {
            for (int j = 0 ; j<val ; j++) {
             System.out.print(String.format(" | %2d", mat[j][i], " | "));
            }
            System.out.println(" | ");
        }
         }
     }