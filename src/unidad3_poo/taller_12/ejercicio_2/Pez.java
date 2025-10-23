package taller_12.ejercicio_2;

public class Pez implements Nadador, Respirador {

    @Override
    public void nadar() {
        System.out.println("El pez esta nadando");
    }

    @Override
    public void respirar() {
        System.out.println("El pez esta respirando");
    }

}
