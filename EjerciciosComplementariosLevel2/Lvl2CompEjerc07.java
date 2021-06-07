/**
 * Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de Strings.
 * Con la secuencia de números enteros de principio a final.
 * Pero si el número es multiplo de 2 colocara el valor “Fizz”, 
 * si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”. 
 * 
 * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar (no se incluye en el cálculo)
 * Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4 
 * Input (Entrada):
 * fizzBuzzFuncion(1,6)    // 6 si marca el límite y no se lo incluye
 * fizzBuzzFuncion(1,8)
 * Output (Salida):
 * [“1”, “Fizz”, “Buzz”, “Fizz”, "5"]
 * [“1”, “Fizz”, “Buzz”, “Fizz”, “5”, “FizzBuzz”, “7”]
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.*;

public class Lvl2CompEjerc07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola

        System.out.print("Ingrese el primer número (desde) --->  ");
        int desde = scanner.nextInt();
        System.out.print("Ingrese el segundo número (hasta) --->  ");
        int hasta = scanner.nextInt();
        scanner.close();

        String[] resultado = new String[hasta - desde];
        resultado = fizzBuzzFuncion(desde, hasta);

        System.out.println("Resultado:");
        System.out.println(Arrays.toString(resultado));

        System.out.println();   // Salto de línea para que se lea bien en consola
    }

    public static String[] fizzBuzzFuncion(int desde, int hasta) {
        // Múltiplo de 2: "Fizz"
        // Múltiplo de 3: "Buzz"
        // Múltiplo de ambos: "FizzBuzz"
        
        String[] listaFinal = new String[hasta - desde];
        int indice = 0;
        for (int i = desde; i < hasta; i++) {
            String item = "";
            boolean fizz = i % 2 == 0;
            boolean buzz = i % 3 == 0;
            
            if (fizz && buzz) {
                item = "FizzBuzz";
            } else if (fizz) {
                item = "Fizz";
            } else if (buzz) {
                item = "Buzz";
            } else {
                item = String.valueOf(i);
            }
            listaFinal[indice] = item;
            indice += 1;
        }
        return listaFinal;
    }
}
