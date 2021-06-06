/**
 * Realizar un programa que solicite por consola 2 números enteros,
 * para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división)
 * de ambos números. 
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.Scanner;

public class Lvl1CompEjerc02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();   // Salto de línea para que se lea bien en consola
        
        System.out.print("Ingrese el primer número --->  ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número --->  ");
        int num2 = scanner.nextInt();
        scanner.close();
        
        int suma = num1 + num2;
        int resta = num1 - num2;
        int mult = num1*num2;
        int div = num1 / num2;
        int mod = num1 % num2;

        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + mult);
        System.out.println(num1 + " / " + num2 + " = " + div);
        System.out.println(num1 + " % " + num2 + " = " + mod);

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}
