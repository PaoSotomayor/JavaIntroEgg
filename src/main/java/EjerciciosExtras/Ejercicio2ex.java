/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

/*Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una. 
A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores iniciales y 
los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class Ejercicio2ex {

    /*A 1= D(4)
      B 2= C (3)
      C 3= A (1)
      D 4= B (2)
     */
    public static void main(String[] args) {
        int A=1;
      int B=2;
      int C=3;
      int D=4;
      int cent;
        System.out.print("Los valores de A, B, C y D son: ");
      System.out.println((A)+" "+(B)+""+" "+(C)+" "+(D));
      
     cent = B;
        B = C;
        C = A;
        A = D;
        D = cent;
        System.out.println("");
        System.out.print("Los valores de B, C, A y D son: ");

        System.out.println((B)+" "+(C)+""+" "+(A)+" "+(D));
      
      
    }
    
}