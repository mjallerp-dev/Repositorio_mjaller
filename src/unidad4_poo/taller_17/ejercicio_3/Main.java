package unidad4_poo.taller_17.ejercicio_3;

public class Main {

    public static void main(String[] args) {
        
        Transporte bicicleta = new Bicicleta(25, "Rojo");
        Transporte coche = new Coche(180, "Azul");

        bicicleta.mover();
        coche.mover();
    }

}
