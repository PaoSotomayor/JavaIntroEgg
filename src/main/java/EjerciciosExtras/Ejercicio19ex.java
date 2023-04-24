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
public class Ejercicio19ex {

    /*Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia entre 
    los elementos).
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner (System.in);
        System.out.println(" ingrese la longitud de los vectores");
        int n1;
        n1=leer.nextInt();
      double [] vec = new double [n1] ;
      double [] vec2 = new double [n1] ;
      for (int i = 0; i < vec.length; i++) {
            System.out.println("ingrese  los valores del vecor1");
            vec[i]=leer.nextDouble();
        }
      for (int i = 0; i < vec2.length; i++) {
            System.out.println("ingrese  los valores del vector2");
            vec2[i]=leer.nextDouble();
        }
 
        System.out.println(" son iguales? " +     soniguales(vec,vec2));
    }
    public static boolean soniguales (double vec[], double vec2[]){
        
        for (int i = 0; i < vec.length; i++) {
            if (vec[i]!=vec2[i]) {
                return false;
            }
        }
       return true; 
    }
     }
