import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Funciones {

    /**
     * Este método devuelve una lista de Empleados, leídos desde un
     * archivo con una ubicación pasada como parámetro String
     *
     * @param ubicacion Ubicación del archivo a leer
     * @return Lista de empleados leídos en el archivo
     */
    public static List<Empleado> listaEmpleados(String ubicacion) {
        File file;
        FileReader fileReader = null;
        BufferedReader bufferedReader;
        List<Empleado> listaEmpleados = new ArrayList<>();

        try {
            file = new File(ubicacion);
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


    /**
     * Este método devuelve una lista de Empleados
     * cuyos apellidos empiezan con la letra indicada como parámetro
     *
     * @param empleados      Lista completa de empleados a filtrar
     * @param letraRequerida letra con la que inicia el apellido
     * @return List empleadosFiltrados
     */
    public static List<Empleado> getEmpleadosPorLetraApellido(List<Empleado> empleados, String letraRequerida) {
        List<Empleado> resultado = new ArrayList<>();
        letraRequerida = letraRequerida.toUpperCase();

        for (Empleado empleado : empleados) {
            //String letraInicio = String.valueOf(empleado.getApellido().charAt(0));
            if (empleado.getApellido().toUpperCase().startsWith(letraRequerida)) {
                resultado.add(empleado);
            }
        }
        return resultado;
    }


    /**
     * Este método devuelve el Empleado más joven
     * de una lista de Empleados dada como argumento.
     * Se comparan los días vividos de cada uno, para mayor precisión.
     *
     * @param empleados Lista de empleados a analizar
     * @return empleado más joven (Empleado)
     */
    public static Empleado getEmpleadoMasJoven(List<Empleado> empleados) {
        Empleado referencia = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getEdadDias() < referencia.getEdadDias()) {   // Comparo edades midiendo los días transcurridos, para mayor precisión
                referencia = empleado;
            }
        }
        return referencia;
    }


    /**
     * Este método devuelve el Empleado más viejo
     * de una lista de Empleados dada como argumento.
     * Se comparan los días vividos de cada uno, para mayor precisión.
     *
     * @param empleados Lista de empleados a analizar
     * @return empleado más viejo (Empleado)
     */
    public static Empleado getEmpleadoMasViejo(List<Empleado> empleados) {
        Empleado referencia = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getEdadDias() > referencia.getEdadDias()) {   // Comparo edades midiendo los días transcurridos, para mayor precisión
                referencia = empleado;
            }
        }
        return referencia;
    }


    /**
     * Este método devuelve el Empleado que tiene el sueldo más bajo
     * de una lista de Empleados dada como argumento.
     *
     * @param empleados Lista de empleados a analizar
     * @return empleado con el menor sueldo
     */
    public static Empleado getEmpleadoMenosGana(List<Empleado> empleados) {
        Empleado referencia = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getSueldo() < referencia.getSueldo()) {
                referencia = empleado;
            }
        }
        return referencia;
    }


    /**
     * Este método devuelve el Empleado que tiene el sueldo más alto
     * de una lista de Empleados dada como argumento.
     *
     * @param empleados Lista de empleados a analizar
     * @return empleado con el mayor sueldo
     */
    public static Empleado getEmpleadoMasGana(List<Empleado> empleados) {
        Empleado referencia = empleados.get(0);
        for (Empleado empleado : empleados) {
            if (empleado.getSueldo() > referencia.getSueldo()) {
                referencia = empleado;
            }
        }
        return referencia;
    }


    /**
     * Devuelve una lista de empleados,
     * ordenada por apellido y luego por nombre.
     *
     * @param empleados Lista de empleados original
     * @return Lista de empleados ordenada alfabéticamente por apellido y luego por nombre
     */
    public static List<Empleado> getEmpleadosOrdenAlfabetico(List<Empleado> empleados) {
        empleados.sort(Comparator.comparing(Empleado::getApellido).thenComparing(Empleado::getNombre));
        return empleados;
    }

}
