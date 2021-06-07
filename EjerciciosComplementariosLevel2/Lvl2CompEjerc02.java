/**
 * Crear un ArrayList, agregar 5 números enteros. 
 * Luego, agregar un número entero al principio de la lista y otro al final.
 * Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma
 * (antes y después de agregar a en la primera y última posición).
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;
import java.util.ArrayList;

public class Lvl2CompEjerc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int lectura = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("(" + String.valueOf(i+1) + ") Ingrese un número --->  ");
            lectura = scanner.nextInt();
            numeros.add(lectura);
        }

        System.out.println("Tamaño de la lista (antes de agregar más números): " + String.valueOf(numeros.size()));
        System.out.println();
        System.out.print("Número a agregar al principio --->  ");
        lectura = scanner.nextInt();
        numeros.add(0, lectura);

        System.out.print("Número a agregar al final --->  ");
        lectura = scanner.nextInt();
        numeros.add(lectura);
        scanner.close();

        System.out.println();   // Salto de línea para que se lea bien en consola
        
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        System.out.println("Tamaño de la lista (después de agregar más números): " + String.valueOf(numeros.size()));

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
