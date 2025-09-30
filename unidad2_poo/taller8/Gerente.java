package repositorio_mjaller.unidad2_poo.taller8;

public class Gerente extends Empleado {
    private String departamento;

    public Gerente(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
}
