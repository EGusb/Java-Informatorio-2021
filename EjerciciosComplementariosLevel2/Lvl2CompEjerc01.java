/**
 * Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
 * 
 * Input (Entrada):
 * Bariloche
 * Córdoba
 * Resistencia
 * 
 * Output (Salida):
 * #1 - Bariloche
 * #2 - Córdoba
 * #3 - Resistencia 
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

public class Lvl2CompEjerc01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola

        ArrayList<String> ciudades = new ArrayList<String>();

        while (true) {
            System.out.print("Ingrese una ciudad (\"-1\" para terminar) --->  ");
            String lectura = scanner.nextLine();

            if (lectura.startsWith("-1")) {
                break;
            } else {
                ciudades.add(lectura);
            }
        }
        scanner.close();
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        for (int i = 0; i < ciudades.size(); i++) {
            System.out.println("#" + String.valueOf(i+1) + " - " + ciudades.get(i));
        }
        
        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
