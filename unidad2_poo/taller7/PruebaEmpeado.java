package repositorio_mjaller.unidad2_poo.taller7;

public class PruebaEmpeado {

    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Miguel", 1000);
        Empleado emp2 = new Empleado("Angel", 500);
        emp1.mostrarDatos();
        emp2.mostrarDatos();
        emp1.setNombre(null);
        emp2.setNombre("  ");
        emp1.setSalario(-200);
        emp2.setSalario(1500);
        emp1.mostrarDatos();
        emp2.mostrarDatos();
    }

}
