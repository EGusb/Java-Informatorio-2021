/**
 * 
 * 
 */

/*
 * import java.util.Scanner; Scanner scanner = new Scanner(System.in);
 * System.out.println(); int num = scanner.nextInt(); // Leo un entero
 * scanner.close();
 */
import java.util.Scanner;

public class Lvl1CompEjerc03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese un número entero --->  ");
        int num = scanner.nextInt(); // Leo un entero
        scanner.close();

        String linea = "";
        for (int i = 1; i <= num; i++) {
            linea = linea + i + " ";
            System.out.println(linea);
        }

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
