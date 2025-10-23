package taller_12.ejercicio_1;

public class Ave implements Volador, Cantante {

    @Override
    public void volar() {
        System.out.println("El ave esta volando");
    }

    @Override
    public void cantar() {
        System.out.println("El ave esta cantando");
    }

}
