/*
*/
//package EjercicioPropuesto5;

import java.io.*;
import java.util.*;

public class EjercicioPropuesto5 {
    public static void main(String[] args) {
        System.out.println();   // Salto de línea para que se lea bien en consola
        List<Empleado> empleados = listaEmpleados();

        for (Empleado empleado: empleados) {
            System.out.println(empleado);
        }

        System.out.println();   // Salto de línea para que se lea bien en consola
    }

    public static List<Empleado> listaEmpleados(){
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        List<Empleado> listaEmpleados = new ArrayList<>();

        try {
            file = new File("src/lista_empleados.txt");
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);

            String linea = bufferedReader.readLine();
            while (linea != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String apellido = datos[1];
                String nacimiento = datos[2];
                String sueldo = datos[3];
                Empleado empleado = new Empleado(nombre, apellido, nacimiento, sueldo);
                listaEmpleados.add(empleado);

                linea = bufferedReader.readLine();
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
            } catch (IOException err) {
                err.printStackTrace();
            }
        }
        return listaEmpleados;
    }
}