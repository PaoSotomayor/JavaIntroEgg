/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EjerciciosExtras;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Ejercicio5ex {

/*Una obra social tiene tres clases de socios:
- Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
  todos los tipos de tratamientos.
- Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
  que los socios del tipo A.
- Los socios que menos aportan,los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
- Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que 
  represente el costo del tratamiento (previo al descuento) y determine el importe en efectivo a 
  pagar por dicho socio.
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
     
        char opcion;
        double valor;     
        
        do {
            System.out.println("A: 50% de descuento");
            System.out.println("B. 35% de descuento");
            System.out.println("C. No aplica descuento");
            System.out.println("-----------------------");
            System.out.println("Elija una categoría: ");
        opcion = leer.next().charAt(0);
        } while (opcion != 'A' && opcion != 'B' && opcion != 'C');
        
        System.out.println("Ingrese el valor del tratamiento");
        valor = leer.nextInt();
        
        if (opcion == 'A') {
            valor = valor * 0.50;
            System.out.println("Descuento aplicable: 50%");
                System.out.println("Importe con descuento: $" + valor); 
        }                
                if (opcion == 'B') {
                    valor -= valor * 0.35;
                System.out.println("Descuento aplicable: 35%");
                System.out.println("Importe con descuento: $" + valor);
                }
                if (opcion == 'C') {
                    System.out.println("Este tratamiento no recibe descuento");
                }
        }
            
            }
        

            
        
    
    

