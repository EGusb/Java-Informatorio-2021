import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class EjercicioPropuesto5 {
    public static void main(String[] args) {
        System.out.println();   // Salto de línea para que se lea bien en consola
        String ubicacionArchivo = "src/lista_empleados.txt";
        List<Empleado> empleados = Funciones.listaEmpleados(ubicacionArchivo);

        System.out.println("Lista completa de empleados:");
        System.out.println("APELLIDO Y NOMBRE             FECHA NACIMIENTO     EDAD (años)    SUELDO");
        for (Empleado empleado: empleados) {
            System.out.printf("%-30s", empleado.getApellido() + ", " + empleado.getNombre());
            System.out.printf("%-21s", empleado.getNacimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.printf("%-15s", empleado.getEdad());
            System.out.println("$ " + empleado.getSueldo());
        }
        System.out.println();


        String letraInicio = "B";
        List<Empleado> prueba = Funciones.getEmpleadosPorLetraApellido(empleados, "B");
        System.out.println("Lista de empleados cuyos apellidos empiezan con la letra '" + letraInicio + "':");
        System.out.println("APELLIDO Y NOMBRE             FECHA NACIMIENTO     EDAD (años)    SUELDO");
        for (Empleado empleado: prueba) {
            System.out.printf("%-30s", empleado.getApellido() + ", " + empleado.getNombre());
            System.out.printf("%-21s", empleado.getNacimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.printf("%-15s", empleado.getEdad());
            System.out.println("$ " + empleado.getSueldo());
        }
        System.out.println();


        Empleado joven = Funciones.getEmpleadoMasJoven(empleados);
        Empleado viejo = Funciones.getEmpleadoMasViejo(empleados);
        System.out.println("El empleado más JOVEN es: " + joven.getApellido() + ", " + joven.getNombre() + " - " + joven.getEdad() + " años");
        System.out.println("El empleado más VIEJO es: " + viejo.getApellido() + ", " + viejo.getNombre() + " - " + viejo.getEdad() + " años");

        System.out.println();

        Empleado menorSueldo = Funciones.getEmpleadoMenosGana(empleados);
        Empleado mayorSueldo = Funciones.getEmpleadoMasGana(empleados);
        System.out.println("El empleado con el MENOR sueldo es: " + menorSueldo.getApellido() + ", " + menorSueldo.getNombre() + " - $" + menorSueldo.getSueldo());
        System.out.println("El empleado con el MAYOR sueldo es: " + mayorSueldo.getApellido() + ", " + mayorSueldo.getNombre() + " - $" + mayorSueldo.getSueldo());

        System.out.println();


        List<Empleado> listaOrdenada = Funciones.getEmpleadosOrdenAlfabetico(empleados);
        System.out.println("Empleados ordenados alfabéticamente:");
        System.out.println("APELLIDO Y NOMBRE             FECHA NACIMIENTO     EDAD (años)    SUELDO");
        for (Empleado empleado: listaOrdenada) {
            System.out.printf("%-30s", empleado.getApellido() + ", " + empleado.getNombre());
            System.out.printf("%-21s", empleado.getNacimiento().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
            System.out.printf("%-15s", empleado.getEdad());
            System.out.println("$ " + empleado.getSueldo());
        }

        System.out.println();   // Salto de línea para que se lea bien en consola
    }
}