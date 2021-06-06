/**
 * Solicitar por consola el nombre del usuario e imprimir por pantalla el siguiente mensaje “HOLA {USUARIO}!!!”
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

public class Lvl1CompEjerc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese un nombre de usuario --->  ");
        String name = scanner.nextLine();
        System.out.print("HOLA " + name + "!!!");
        
        System.out.println();   // Salto de línea para que se lea bien en consola
        scanner.close();
    }
}
