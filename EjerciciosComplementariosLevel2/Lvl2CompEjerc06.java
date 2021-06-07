/**
 * Se dispone de una lista de Empleados, de cada empleado se conoce:
 * ○	Nombre y Apellido
 * ○	DNI
 * ○	horasTrabajadas
 * ○	valorPorHora
 * 
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el sueldo (horasTrabajadas x valorPorHora) de toda esa lista 
 * para luego almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor (value) es el sueldo calculado.
 */ 

/*
import java.util.Scanner;
Scanner scanner = new Scanner(System.in);
System.out.println();
int num = scanner.nextInt();   // Leo un entero
scanner.close();
*/
import java.util.*;
import Empleado;

public class Lvl2CompEjerc06 {
    public static void main(String[] args) {
        System.out.println(); // Salto de línea para que se lea bien en consola
        
        Empleado empleado1 = new Empleado();      // Creo un empleado
        empleado1.setNombre("Armando Artigas");
        empleado1.setDni(11223344);
        empleado1.setHorasTrabajadas(5);
        empleado1.setValorPorHora(1000);

        Empleado empleado2 = new Empleado();      // Creo otro empleado
        empleado2.setNombre("Bruno Barrientos");
        empleado2.setDni(99887766);
        empleado2.setHorasTrabajadas(15);
        empleado2.setValorPorHora(1300);

        Empleado empleado3 = new Empleado();      // Creo otro empleado
        empleado3.setNombre("Carlos Canteros");
        empleado3.setDni(44556600);
        empleado3.setHorasTrabajadas(20);
        empleado3.setValorPorHora(1800);

        Set<Empleado> empleados = new HashSet();
        // Agrego los 3 empleados al Set
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);

        HashMap<Integer, Integer> sueldos = new HashMap();  // Creo el HashMap para guardar Dnis y sueldos a pagar
        
        for (Empleado emp: empleados) {
            System.out.println("Nombre: " + emp.getNombre());
            int dni = emp.getDni();
            System.out.println("   DNI: " + dni);
            int sueldo = emp.getHorasTrabajadas() * emp.getValorPorHora();
            System.out.println("Sueldo: " + sueldo);
            sueldos.put(dni, sueldo);
            System.out.println();
        }
        System.out.println("Resultado:");
        System.out.println(sueldos);

        System.out.println(); // Salto de línea para que se lea bien en consola
    }
}
