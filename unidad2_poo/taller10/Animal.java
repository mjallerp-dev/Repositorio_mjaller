package repositorio_mjaller.unidad2_poo.taller10;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void sonido() {
        System.out.println("El " + getEspecie() + " hace un sonido.");
    }
}
