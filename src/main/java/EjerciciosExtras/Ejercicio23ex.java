/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Random;
import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida que el usuario 
las va ingresando, construya una “sopa de letras para niños” de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria. 
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados con un número aleatorio 
del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones 
de Java substring(), Length() y Math.random().
 */
public class Ejercicio23ex {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
     
        String[] palabras = new String[]{"AAAAA","BBBBB","CCCCC","DDDDD","EEEEE"};//borrar X y poner 5 en String[].
        String[][] sopa = new String[20][20];
        /*for (int i = 0; i < 5; i++) {
            palabras[i] = ingresarPalabra();
        }*/
        int fila, columna, aux = 0, x, y;
        for (int j = 0; j < 20; j+=5) {            
            if (aux < 5) {
                columna = j;
                fila = random.nextInt(20);
                x = 0;
                y = 1;
                for (int i = 0; i < palabras[aux].length(); i++) {
                    while(sopa[fila][columna]!=null){
                        fila = random.nextInt(20);
                    }
                    sopa[fila][columna] = palabras[aux].substring(x, y);
                    x++; y++; columna++;
                }j-=2;
            }            
            aux++;
        }
        //RELLENO LO RESTANTE CON NUMEROS
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if(sopa[i][j] == null){//si existen null en la matriz, la rellena con números.
                    sopa[i][j] = Integer.toString((int)(Math.random()*10));
                }
            }
        }
        //MUESTRO LA MATRIZ
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("|" + sopa[i][j] + "");
            }
            System.out.println("|");
        }
    }
    
    public static String ingresarPalabra(){
        Scanner leer = new Scanner(System.in);
        String palabra;
        int longitud;
        do {
                System.out.print("Ingrese una palabra: ");
                palabra = leer.next(); palabra = palabra.toUpperCase();
                longitud = palabra.length();
                if(longitud<3 || longitud>5) System.out.println("Palabra inválida. Reingrese.");
            } while(longitud<3 || longitud>5);
        return palabra;
    }
}