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
public class Ejercicio3ex {

    /*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
    Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese una letra");
        String letra=leer.nextLine();
        
        if(letra.length()>1){
            do{
            System.out.println("ingrese una letra");
            letra=leer.nextLine();
            }while(letra.length()>1);
        }
        
        if (letra.equalsIgnoreCase("A")||letra.equalsIgnoreCase("E")||letra.equalsIgnoreCase("I")||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")) {
            System.out.println("Correcto");
        }
        else{
            System.out.println("incorrecto");
        }
        
    }
    
}
