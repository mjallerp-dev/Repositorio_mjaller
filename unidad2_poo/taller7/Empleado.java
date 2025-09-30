package unidad2_poo.taller7;

public class Empleado {
    public String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public int getNombre() {
        return this.salario;
    }
    public void setSalario(int salario) {
        if (salario<0) { 
            System.out.println("El salario no puede ser negativo, se asignara 0 por defecto");
            this.salario=0;
        }
        else {this.salario = salario;}
    }
}
