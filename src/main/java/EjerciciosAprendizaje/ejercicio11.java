/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/*Realizar un programa que pida dos números enteros positivos por teclado y muestre 
por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar 4. Dividir
5. Salir
Elija opción
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú. 
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la 
opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        int menu, num, num2, resultado; 
        String opc = null;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        num = leer.nextInt();
        num2 = leer.nextInt();
        do {
            System.out.println("---------------");
            System.out.println("---------------");
            System.out.println("MENU");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("Elija una opcion: ");
            menu = leer.nextInt();
            
            switch (menu) {
            
            case 1 -> {
                resultado = num + num2;
                System.out.println();
                System.out.println(" La Suma es: " + resultado);
                }
            case 2 -> {
                resultado = num - num2;
                System.out.println();
                System.out.println(" La Resta es: " + resultado);
                }
            case 3 -> {
                resultado = num * num2;
                System.out.println();
                System.out.println(" La multiplicacion es: " + resultado);
                }
            case 4 -> {
                resultado = num / num2;
               
                System.out.println(" La divsion es: " + resultado);
                }
            case 5 -> {
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                
                opc = leer.nextLine();
                }
            default -> System.out.println("Error, elige una opcion entre 1 y 5");
            }    
        } while("S".equals(opc));
           
        
    }    
}