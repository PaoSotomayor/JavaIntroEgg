/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

/**
 *
 * @author user
 */
public class ejercicio15 {

    /*Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y 
    los muestre por pantalla en orden descendente.
     */
    public static void main(String[] args) {

        int[] primerosNum = new int[100];

        for (int i = 0; i < primerosNum.length; i++) {
            primerosNum[i] += i;
            
        }
        for (int i = primerosNum.length-1; i >= 0; i--) {
            System.out.println(primerosNum[i]);
        }
    }

}
