package repositorio_mjaller.unidad2_poo.taller8;

public class PruebaGerente {

    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Miguel", 26);
        empleado1.mostrarDetalles();
        empleado1.setNombre("");
        empleado1.mostrarDetalles();
        Gerente gerente1 = new Gerente("Angel", 27, "Sistemas");
        gerente1.mostrarDetalles();
        Gerente gerente2 = new Gerente("Ronald", 30, "Recursos Humanos");
        gerente2.mostrarDetalles();
        gerente1.setDepartamento(null);
        gerente2.setDepartamento("Ventas");
        gerente1.mostrarDetalles();
        gerente2.mostrarDetalles();
    }

}
