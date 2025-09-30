package repositorio_mjaller.unidad2_poo.taller10;

public class PruebaVehiculo {

    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo(120);
        vehiculo1.moverse();

        Bicicleta bicicleta1 = new Bicicleta(20, "GW", "Rojo");
        bicicleta1.moverse();
    }
}
