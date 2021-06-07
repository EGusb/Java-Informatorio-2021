/**
 * Crear una aplicación que solicite de entrada los datos de una persona en este orden:
 * Nombre y Apellido
 * Edad
 * Dirección
 * Ciudad
 * 
 * Luego imprimirá el siguiente mensaje:
 * {Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
 */

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(); // Salto de línea para que se lea bien en consola

        String[] ingresos = { "Nombre y Apellido", "Edad", "Dirección", "Ciudad" };

        String resultado = "";
        for (int i = 0; i < ingresos.length; i++) {
            System.out.print(ingresos[i] + " --->  ");
            String lectura = scanner.nextLine();

            if (i == 0) {
                resultado = lectura;
            } else {
                resultado = lectura + " - " + resultado;
            }
        }
        scanner.close();

        System.out.println();
        System.out.println(resultado);
        System.out.println(); // Salto de línea para que se lea bien en consola
    }
}
