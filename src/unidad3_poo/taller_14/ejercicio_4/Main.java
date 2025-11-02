package taller_14.ejercicio_4;

public class Main {

    public static void main(String[] args) {
        
        Vehiculo vehiculo1 = new Coche("Toyota", "Prado", 180);
        Vehiculo vehiculo2 = new Bicicleta("Giant", "Montaña", 80);
        vehiculo1.mover();
        vehiculo2.mover();

        vehiculo1.setMarca("");
        vehiculo2.setVelocidadMaxima(-50);
        vehiculo1.mover();
        vehiculo2.mover();
    }

}
