package taller_11.ejercicio_3;

public abstract class Animal {

    public abstract void Alimentarse();

    public void respirar() {
        System.out.println("\nEl animal está respirando y necesita alimentarse");
        Alimentarse();
    }

}
