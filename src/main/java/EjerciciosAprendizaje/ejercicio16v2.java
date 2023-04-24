/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ejercicio16v2 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
        int i, cont = 0;
        int n = 0;
        int m = 0;
        int z = 0;
        int nb = 0;
        Scanner leer = new Scanner(System.in);
        System.out.println("*** Este programa, rellenara un vector y te dira cuantas veces se encuentra el numero elegido ***");
        System.out.println("                              Ingresa el tamaño del vector");
        n = leer.nextInt();
        System.out.println("                   Ingresa el rango de numeros para rellenar el vector");
        System.out.println("   Para numeros comprendidos entre el 1 y 9 ingresa (1),del 1 al 99 (2). del 1 al 999 (3) ");
        
        m = leer.nextInt();
        if (m==1) {
            z=10;
        }if (m==2) {
            z=100;
        }if (m==3) {
            z=1000;
        }
        
        int[] vector = new int[n];
        
        
        for (i = 0; i<n; i++) {
            
            //vector[i] = (int) (Math.random() * 10);
            vector[i] = (int) (Math.random()*z+1);
            
        }
        // recorrer el vector en forma ascendente   
        System.out.println("Vector en forma ascendente!");
        for(i=0; i<vector.length; i++){
            System.out.print(vector[i] + ". ");
        }
        ////vectorAsc(int vector[]);
        
        System.out.println("");
        System.out.println("***************************");
        // recorrer el vector en forma descendente   
        System.out.println("Vector en forma descendente!");
        for(i=vector.length-1; i>=0; i--){
            System.out.print(vector[i] + ". ");
        }
        System.out.println("");
        //Ingresar numero a buscar y el pregrama le dira en que posicion del vector esta y si se repite.
        System.out.println("Ingresar un numero a buscar y el pregrama le dira en que posicion del vector esta y si se repite");
        nb = leer.nextInt();
        //buscaNumero(int nb);
        for(i=0; i<vector.length; i++){
            if (vector[i] == nb) {
                System.out.println("    Se encuentra en la posicion " + (i+1) + " del vector");
                cont ++;
            }
        }
            System.out.println("");
            System.out.println("        El numero "+ nb + ", Se encontro "+ cont + " veces");
        
        //////////////////////////////falta declarar la funsion
        //vectorAsc(int vector[]);
                
                
    }   
    
    public static void vectorAsc(int vector[]){
        // recorrer el vector en forma ascendente
        int i = 0;
        System.out.println("Vector en forma ascendente!");
        for(i=0; i<vector.length; i++){
            System.out.print(vector[i] + ". ");
            System.out.println("");
            System.out.println("ni aca desde dentro del funcion");
        }
        
    }
}