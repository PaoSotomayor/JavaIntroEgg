/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/*Realice un programa para que el usuario adivine el resultado de una multiplicación entre dos números 
generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario si su respuesta es o no correcta. 
En caso que la respuesta sea incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
Para realizar este ejercicio investigue como utilizar la función Math.random() de Java.
 */
public class Ejercicio10ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = (int) (Math.random()* 11), num2 = (int) (Math.random()* 11), result = num1*num2, resp = 0;
        System.out.println(num1);
        System.out.println(num2);
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el resultado de la multiplicacion: ");
        resp = leer.nextInt();
        while (resp != result){
            System.out.println("Error, ingrese un nuevo resultado: ");
            resp = leer.nextInt();
        }
        System.out.println("Has adivinado :)");
    }
    
}
