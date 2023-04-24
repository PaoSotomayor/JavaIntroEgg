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
public class Ejercicio4ex {

    /*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se 
    muestre su equivalente en romano.
     */
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      int N;
      
      do {
            System.out.print("Introduce un número entre 1 y 9: ");
            N = leer.nextInt();
      } while (N < 1 || N > 10);
      System.out.println(N + " en numeros romanos -> " + convertirANumerosRomanos(N));                            
  }
     //función para pasar a números romanos
    public static String convertirANumerosRomanos(int numero) {
      int i, unidades;
      String romano = "";
      unidades = numero %10;
      
    if (unidades == 9) {
          romano =  "IX";
      } else if (unidades >= 5) {
                 romano =  "V";
                 for (i = 6; i <= unidades; i++) {                                                           
                      romano = romano + "I";
                 }
      } else if (unidades == 4) {
                 romano =  "IV";
      } else {
                 for (i = 1; i <= unidades; i++) {
                      romano = romano + "I";
                 }
      }
      return romano;
  }
}  
