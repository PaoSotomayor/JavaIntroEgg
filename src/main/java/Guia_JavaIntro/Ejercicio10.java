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
public class Ejercicio10 {

    /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número 
    ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 *********** 2 **
     */
    public static void main(String[] args) {
       

        Scanner leer = new Scanner(System.in);
    
        int num = 0;
    
        for(int i=0; i<4; i++){
            do{
                System.out.println("Ingrese un numero entre 1-20");
                num = leer.nextInt();
            }while(num<1 || num>20);
            System.out.print(num + " - ");
            for(int j=0; j<num; j++){ //porqué j<num?
                System.out.print("*");
            }
            System.out.println("");            
        } 
        System.out.println("");
    }
     }