package unidad4_poo.taller_18.ejercicio_3;

public class Coche implements Conduccion {

    @Override
    public void conducir(String tipoVehiculo, int velocidadMaxima){
        System.out.println("Conduciendo " + tipoVehiculo + " a " + velocidadMaxima + "km/h");

    }

}
