/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la suma 
de los dos. El programa deberá después mostrar el resultado de la suma
 */
public class ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n1, n2, suma;
        
   System.out.print( "Introduzca primer número: " );
        n1 = leer.nextInt();

        System.out.print( "Introduzca segundo número: " );
        n2 = leer.nextInt();

        suma = n1 + n2;

        System.out.println( "La suma de " + n1 + " más " + n2 + " es " + suma + "." );
    }
}