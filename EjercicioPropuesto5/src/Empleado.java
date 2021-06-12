//package EjercicioPropuesto5;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private float sueldo;

    public Empleado(String nombre, String apellido, String nacimiento, String sueldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.sueldo = Float.parseFloat(sueldo);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = LocalDate.parse(nacimiento, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public LocalDate getNacimiento() {
        return this.nacimiento;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public int getEdad() {
        return Period.between(this.nacimiento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return this.nombre + ',' +
                this.apellido + ',' +
                this.nacimiento.toString() + ',' +
                this.sueldo;
    }
}