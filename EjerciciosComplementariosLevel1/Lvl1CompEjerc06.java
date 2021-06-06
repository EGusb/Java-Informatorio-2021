/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
 * 
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese el primer número entero (base) --->  ");
        int base = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero (exponente) --->  ");
        int exp = scanner.nextInt();
        scanner.close();

        int resultado = 1;

        for (int i = 0; i < exp; i++) {
            resultado *= base;
        }
        System.out.println(base + " elevado a " + exp + " = " + resultado);

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
