/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia_JavaIntro;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio12 {

    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, 
    validando que el primer numero múltiplo del segundo y e imprima si el primer numero 
    es múltiplo del segundo, sino informe que no lo son.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
       
        System.out.println("Ingresa dos numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        esMultiplo(num1, num2);
        
        
    }
    public static void esMultiplo(int num1, int num2){
        if (num1%num2==0){
            System.out.println("Es multiplo");
        
        }else{
            System.out.println("NO ES MULTIPLO");
        }
}


}