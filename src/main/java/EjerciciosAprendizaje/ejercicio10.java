/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/*Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
public class ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int limite, suma= 0, num;
        
        //do {
            System.out.println("Ingrese el límite a superar");
            limite = leer.nextInt();
           // } while (limite < 0);
            
        
        do {
            System.out.println("Ingrese el número a sumar");
            num = leer.nextInt();
            suma += num;
            } while (suma <= limite);
        
        System.out.println("La suma " + suma + " supero al Limite: " + limite);
    }
}