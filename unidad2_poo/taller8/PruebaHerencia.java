package repositorio_mjaller.unidad2_poo.taller8;

//public class PruebaHerencia extends Persona, Vehiculo { No es posible heredar de multiples clases
// Una clase hija solo puede tener una clase padre

public class PruebaHerencia extends Persona {

    protected String departamento;

    public PruebaHerencia(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }
}
