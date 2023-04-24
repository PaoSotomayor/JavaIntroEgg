/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejemplos;

/**
 *
 * @author user
 */
public class Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            
            if(i == 4){
                
                continue; // El continue cuando se encuentra el 4, salta el 4 pero continua con el for
                
                
            }
            
            System.out.println("El numero es " + i);
            
            
        }
    }
}
