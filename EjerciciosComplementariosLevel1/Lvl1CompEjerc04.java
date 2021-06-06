/**
 * Realizar un programa que calcule el factorial de un número:
 * n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.
 * 
 * Sin hacer uso de librerías.
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese un número entero --->  ");
        int num = scanner.nextInt(); // Leo un entero
        scanner.close();

        int resultado = num;
        for (int i = num-1; i > 1; i--) {
            resultado = resultado * i;
        }
        System.out.println("El factorial de " + num + " es: " + resultado);

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
