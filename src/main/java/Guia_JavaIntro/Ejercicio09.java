/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_JavaIntro;

import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe 
salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar el resultado de la suma de los números leídos, 
pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int x;
        int r=0;
        int contador = 0;
        int suma;  //qué función tiene suma?
        System.out.println("Ingrese 20 números");
        
        do{
            
            x = leer.nextInt();
            contador++;
            
            if(x>0){
            r+=x; //porqué r+=x?
            }
            if(x == 0){
            System.out.println("Se capturó el numero cero");
            break;
        }
    }while(x !=0 && contador <20); // Si esto es falso se sale (SI X PASA DE 20 SE SALE)
       
        if(contador == 20){
        System.out.println("Ya ingresó los 20 digitos, ha salido del bucle");
        }
        System.out.println("La suma total es; "+r);
        
        
    }
    
}