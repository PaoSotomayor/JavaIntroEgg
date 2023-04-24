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
public class Ejercicio9ex {

    /*Simular la división usando solamente restas. Dados dos números enteros mayores que uno, 
    realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método: Restar el 
    dividendo del divisor hasta obtener un resultado menor que el divisor, este resultado es el residuo, y 
    el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada 37 – 13 = 24 dos restas realizadas
 
 49
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int numerador,denominador,cociente=0;
        System.out.println("ingrese los valores a dividir num1/num2");
        numerador=leer.nextInt();
        denominador=leer.nextInt();
        
        
        do {            
            numerador-=denominador;
            cociente++;
        } while (numerador>=denominador);
        
        System.out.println("el residuo es: "+numerador);
        System.out.println("el cociente es: "+cociente);
    }
    
}