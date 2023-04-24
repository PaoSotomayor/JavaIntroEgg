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
public class Ejercicio16ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Ingrese el nombre de la persona: ");
            String nombre = input.nextLine();

            System.out.print("Ingrese la edad de la persona: ");
            int edad = input.nextInt();
            input.nextLine();

            System.out.printf("La persona ingresada es %s, ", nombre);
            if (edad >= 18) {
                System.out.println("es mayor de edad.");
            } else {
                System.out.println("es menor de edad.");
            }

            System.out.print("¿Quiere seguir ingresando personas? (Sí/No): ");
            String respuesta = input.nextLine();

            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
          }
      }