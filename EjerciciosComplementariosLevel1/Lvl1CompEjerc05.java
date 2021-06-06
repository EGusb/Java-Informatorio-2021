/**
 * Se desea una aplicación que solicite 2 números enteros y realice
 * la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese el primer número entero --->  ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número entero --->  ");
        int num2 = scanner.nextInt();
        scanner.close();

        int resultado = 0;

        for (int i = 0; i < num1; i++) {
            resultado += num2;
        }
        System.out.println(num1 + " x " + num2 + " = " + resultado);

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
