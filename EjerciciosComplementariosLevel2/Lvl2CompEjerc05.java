/**
 * Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado.
 * Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
 * Input (Entrada):
 * [6, 7, 8, 4, 5]
 * [350, 345, 550, 600, 320]
 * 
 * ## Los arrays son iguales y corresponden a los días trabajados de una semana Lun-Vie.
 * Output (Salida):
 * [2100, 2415, 4400, 2400, 1600]
 * Total Final: $ 12915
 */

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.ArrayList;

public class Lvl2CompEjerc05 {
    public static void main(String[] args) {
        System.out.println(); // Salto de línea para que se lea bien en consola
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorPorHora = new ArrayList<Integer>();
        ArrayList<Integer> totales = new ArrayList<Integer>();

        // Arrays que simulan input
        int[] horas = { 6, 7, 8, 4, 5 };
        int[] valores = { 350, 345, 550, 600, 320 };

        int totalACobrar = 0;
        for (int i = 0; i < horas.length; i++) {
            horasTrabajadas.add(horas[i]);
            valorPorHora.add(valores[i]);
            totales.add(horasTrabajadas.get(i) * valorPorHora.get(i));
            totalACobrar += totales.get(i);
        }
        System.out.println("Entrada:");
        System.out.println(horasTrabajadas);
        System.out.println(valorPorHora);
        System.out.println();
        System.out.println("Salida:");
        System.out.println(totales);
        System.out.println("Total Final: $ " + totalACobrar);

        System.out.println(); // Salto de línea para que se lea bien en consola
    }
}
