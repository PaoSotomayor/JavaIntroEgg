/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author user
 */
public class Matriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[3][3]; // Le ponemos la dimension a la matriz, 
        // un 3 para las filas o otro para las columnas

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                matriz[i][j] = 6; // Le asignamos a cada posicion de la matriz
                // en sus filas

            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println(" ");
        }

      

    }

}