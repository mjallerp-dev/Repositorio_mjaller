package unidad4_poo.taller_18.ejercicio_3;

public class Contenedor implements Mercancia {

    @Override
    public void cargarMercancia(String producto, double peso){
        System.out.println("Cargando el contenedor con " + producto + " que tiene un peso de " + peso + "Kg");
    }

}
