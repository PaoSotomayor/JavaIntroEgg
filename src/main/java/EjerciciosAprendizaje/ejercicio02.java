/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;


/**
 *
 * @author user
 */
    import java.util.Scanner;
public class ejercicio02 {

    /*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.
     */

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce un nombre: ");
        nombre = leer.nextLine();
        System.out.println("Mi nombre es " + nombre);                                               
    }
}
 