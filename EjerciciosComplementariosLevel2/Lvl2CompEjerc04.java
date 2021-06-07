
/**
 * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos en 3 cursos (3 arrayList) e imprimir dichos cursos.
 * Ayuda: ArrayList posee un método para particionar en sub-listas?
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Lvl2CompEjerc04 {
    public static void main(String[] args) {
        System.out.println(); // Salto de línea para que se lea bien en consola
        ArrayList<String> estudiantes = new ArrayList<String>();
        ArrayList<List<String>> cursos = new ArrayList<List<String>>();
        
        int cantidadCursos = 3;     // Cantidad de cursos de alumnos
        System.out.println("Cantidad de cursos: " + cantidadCursos); System.out.println();
        
        // Array que simula input
        String[] nombres = { "Alejandro", "Bruno", "Cecilia", "Daniela", "Ernesto", "Florencia", "Gaston", "Hilda",
                "Ivan", "Jacqueline", "Kevin", "Leonardo", };
        for (int i = 0; i < nombres.length; i++) {  // Agrego todos los nombres a un ArrayList, en orden
            estudiantes.add(nombres[i]);
        }

        // Curso 1: desde 0 a 3
        // Curso 2: desde 4 a 7
        // Curso 3: desde 8 a 11

        int alumnosPorCurso = estudiantes.size() / cantidadCursos;
        int desde = 0;
        int hasta = desde + alumnosPorCurso;

        for (int i = 0; i < cantidadCursos; i++) {
            cursos.add(estudiantes.subList(desde, hasta));  // Separo en sub-listas de igual tamaño, por orden según posición en el ArrayList
            desde = hasta;
            hasta = desde + alumnosPorCurso;
            
            System.out.println("Imprimiendo Curso " + String.valueOf(i+1) + ":");
            for(int j = 0; j < cursos.get(i).size(); j++) {
                System.out.println("    " + cursos.get(i).get(j));
            }
            
            System.out.println();
        }
        System.out.println(); // Salto de línea para que se lea bien en consola
    }
}
