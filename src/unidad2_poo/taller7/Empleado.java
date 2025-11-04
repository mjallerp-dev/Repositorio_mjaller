package repositorio_mjaller.unidad2_poo.taller7;

public class Empleado {
    public String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public String getNombre() {
        return this.nombre;
    }
    public int getSalario() {
        return this.salario;
    }
    public void setNombre(String nombre) {
        if (nombre==null || nombre.trim().isEmpty()) {
            System.out.println("El nombre no puede estar vacio, se asignara 'Desconocido' por defecto");
            this.nombre="Desconocido";
        }
        else
        this.nombre = nombre;
    }
    public void setSalario(int salario) {
        if (salario<0) { 
            System.out.println("El salario no puede ser negativo, se asignara 0 por defecto");
            this.salario=0;
        }
        else {this.salario = salario;}
    }
    public void mostrarDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Salario: " + getSalario());
    }
}
