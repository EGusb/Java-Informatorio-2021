/**
 * Crear una lista que contenga como elementos la numeración de cartas de una baraja francesa (solo los valores, no figuras).
 * Se deberá cargar el ArrayList (en orden), imprimir, imprimir en orden inverso (reverse), desordenar (mezclar) el arrayList y volver a imprimir.
 * 
 * Ayuda: ArrayList implementa la interface Collection, existe algún método que me permita hacer la operación sort (mezclar) aleatoriamente? Idem para el reverso
 * 
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.ArrayList;
import java.util.Collections;

public class Lvl2CompEjerc03 {
    public static void main(String[] args) {
        System.out.println();   // Salto de línea para que se lea bien en consola
        ArrayList<String> numCartasArray = new ArrayList<String>();

        // Array que simula input
        String[] numCartas = {"A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};        
        
        for (int i = 0; i < numCartas.length; i++) {
            numCartasArray.add(numCartas[i]);
        }

        System.out.println("Imprimiendo en orden...");
        for (int i = 0; i < numCartasArray.size(); i++) {
            System.out.print(String.valueOf(numCartasArray.get(i)) + " ");
        }

        System.out.println(); System.out.println(); // Saltos de línea para que se lea bien en consola
        System.out.println("Imprimiendo en orden inverso...");
        for (int i = numCartasArray.size() - 1; i >= 0; i--) {
            System.out.print(String.valueOf(numCartasArray.get(i)) + " ");
        }

        System.out.println(); System.out.println(); // Saltos de línea para que se lea bien en consola
        Collections.shuffle(numCartasArray);    // Mezclo el ArrayList
        System.out.println("Imprimiendo en orden aleatorio...");
        for (int i = numCartasArray.size() - 1; i >= 0; i--) {
            System.out.print(String.valueOf(numCartasArray.get(i)) + " ");
        }

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
