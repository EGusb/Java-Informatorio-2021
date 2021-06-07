public class Empleado {
    private String nombre;
    private int dni;
    private int horasTrabajadas;
    private int	valorPorHora;
    
    public void setNombre(String name) {
        this.nombre = name;
    }

    public void setDni(int num) {
        this.dni = num;
    }

    public void setHorasTrabajadas(int hours) {
        this.horasTrabajadas = hours;
    }

    public void setValorPorHora(int val) {
        this.valorPorHora = val;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getDni() {
        return this.dni;
    }

    public int getHorasTrabajadas() {
        return this.horasTrabajadas;
    }

    public int getValorPorHora() {
        return this.valorPorHora;
    }
}