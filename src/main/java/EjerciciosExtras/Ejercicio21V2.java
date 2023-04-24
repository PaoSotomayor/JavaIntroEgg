/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

    /*Los profesores del curso de programación de Egg necesitan llevar un registro de las notas 
    adquiridas por sus 10 alumnos para luego obtener una cantidad de aprobados y desaprobados. 
    Durante el periodo de cursado cada alumno obtiene 4 notas, 2 por trabajos prácticos evaluativos y 
    2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10% Segundo trabajo práctico evaluativo 15% Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. 
    Al final del programa los profesores necesitan obtener por pantalla la cantidad de aprobados y
    desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio mayor 
    o igual al 7 de sus notas del curso.
     */
public class Ejercicio21V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        int n = 2;
        double suma = 0, pTP, sTP, pI, sI;
        double[] alumnos = new double[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Evaluando el " + (i+1) + "º alumnx.");
            System.out.print("Nota del primer trabajo práctico: ");
            pTP = leer.nextInt();
            System.out.print("Nota del segundo trabajo práctico: ");
            sTP = leer.nextInt();
            System.out.print("Nota del primer integrador: ");
            pI = leer.nextInt();
            System.out.print("Nota del segundo integrador: ");
            sI = leer.nextInt();
            alumnos[i] = (pTP + sTP + pI + sI)/4;
        }
        for (int i = 0; i < 10; i++) {
            if(alumnos[i]>=7.0){
                System.out.println("El " + (i+1) + "º alumnx está aprobado.");
            }else System.out.println("El " + (i+1) + "º alumnx está reprobado.");
           
        }
    }
}