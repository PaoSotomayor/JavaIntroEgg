/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosAprendizaje;

/**
 *
 * @author user
 */
public class pruebaVectorAleatorioSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int [] nums = new int [99];
        int suma = 0;
        for (int i = 0; i < nums.length; i++) {
            int aleat = (int) (Math.random() * 100 +1);
            System.out.println(""+aleat);
        }
        
        for (int i = 0; i < nums.length; i++) {
            suma+=nums[i];
        }
        double pro = suma/nums.length;
        
        System.out.println("La suma: " +suma);  
        System.out.println("La media: " +(suma/nums.length));  
    }
}