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
public class ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" C O N V E R T I D O R   D E   M O N E D A S ");
        System.out.println();
        System.out.println("Ingresa el tipo de moneda a converitr (número)");
        System.out.println();
        System.out.println(" 1 - Dólares ");
        System.out.println(" 2 - Yenes");
        System.out.println(" 3 - Libras");
        System.out.println();
        int numC = leer.nextInt();
        
        System.out.println();
        System.out.println("Ingresa la cantidad de euros que deseas convertir");
        System.out.println();
        int euros = leer.nextInt();
        
        convertidor(numC,euros);
    }
 public static void convertidor (int numC,int euros) {
        
        double coin;
        switch (numC) {
            
            case 1:
                coin = (euros * 1.28611);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " dólares");
                break;
            case 2:
                coin = (euros * 129.852);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " yenes");
                break;
            case 3:
                coin = (euros * 0.86);
                System.out.println();
                System.out.println(euros + " euros equivalen a " + coin + " libras");
                break;   
}
        }
  }
