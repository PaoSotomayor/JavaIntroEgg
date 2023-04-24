/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Random;
import java.util.Scanner;

/*Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios 
y muestre la suma de sus elementos.
 */
public class Ejercicio22ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Cantidad de filas: ");
        int f = leer.nextInt();
        System.out.print("Cantidad de columnas: ");
        int c = leer.nextInt();
        int[][] matriz = new int[f][c];
        int suma = 0;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < c; j++) {
                matriz[i][j] = random.nextInt(10);
                System.out.print(matriz[i][j] + " ");
                suma+=matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("Suma de sus elementos: " + suma);
    }    
}