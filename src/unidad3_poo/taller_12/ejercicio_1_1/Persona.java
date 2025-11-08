package taller_12.ejercicio_1_1;

public class Persona implements Hablador, Trabajador {

    @Override
    public void hablar() {
        System.out.println("La persona está hablando");
    }

    @Override
    public void trabajar() {
        System.out.println("La persona está trabajando");
    }
}
