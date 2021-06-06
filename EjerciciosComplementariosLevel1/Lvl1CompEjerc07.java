/**
 * Realizar un Programa que, dado un String de entrada en minúsculas, lo convierta por completo a mayúsculas.
 * Sin uso de métodos o librerías que realicen toUppercase().
 */

/*
Tabla ASCII:
    DEC 65 a DEC 90 = A - Z (mayúsculas)
    DEC 97 a DEC 122 = a - z (minúsculas)
    Diferencia = 97 - 65 = 32
    Hay que restar 32 a un caracter ASCII entre 97 y 122 para conseguir el mismo caracter en mayúsculas
*/
import java.util.Scanner;

public class Lvl1CompEjerc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese el String --->  ");
        String texto = scanner.nextLine();
        scanner.close();

        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
        char letra = texto.charAt(i);   // Leo el caracter en la posición i
        int numAscii = letra;           // Número entero en la tabla ASCII
        
        if ((numAscii >= 97) && (numAscii <= 122)) {    // Si es minúsucula (se encuentra entre los números DEC 97 y 122)
            int reemplazo = numAscii - 32;              // Resto 32 para pasar a mayúsucula
            letra = (char)reemplazo;
        }
        
        resultado += letra;
        }

        System.out.println("String resultante: " + resultado);
        System.out.println();
    }
}
