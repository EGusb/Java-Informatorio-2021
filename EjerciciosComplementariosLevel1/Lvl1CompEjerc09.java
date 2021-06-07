/**
 * Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
 * ENTRADA:
 *          Hola Informatorio Java 2020.
 *          a
 * SALIDA:
 *          4
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese el String --->  ");
        String texto = scanner.nextLine();
        System.out.print("Ingrese la letra ---->  ");
        String ingreso = scanner.nextLine();
        scanner.close();

        char letra = ingreso.charAt(0);
        int contador = 0;
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == letra) {
                contador++; 
            }
        }

        System.out.println();
        System.out.println(contador);
        System.out.println();
    }
}
