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
public class Ejercicio7ex {

    /*Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio de n 
    números (n>0). El valor de n se solicitará al principio del programa y los números serán 
    introducidos por el usuario. Realice dos versiones del programa, una usando el bucle “while” y 
    otra con el bucle “do - while”.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int menor = 0, mayor = 0, i = 0, num;
        double promedio = 0;
        System.out.println("Ingrese la cantidad de numeros que desea calcular: ");
        int n = leer.nextInt();
        while(n<0){
            System.out.println("Ingrese la cantidad de que desea calcular: ");
            n = leer.nextInt();
        }
        do {
            System.out.println("Ingrese un número: ");
            num = leer.nextInt();
            if (i==0) {
                menor = num;
                mayor = num;
            }
            if (num<menor) {
                menor = num;
            }else if (num>mayor) {
                mayor = num;
            }
            promedio += num;
            i++;
        } while (i<n);
        System.out.println("El numero menor es: " + menor);
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El promedio es: " + (promedio/n));       
    }   
}