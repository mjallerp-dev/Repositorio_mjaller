package repositorio_mjaller.unidad2_poo.taller9;

public class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void mostrarEspecie() {
        System.out.println("\nDetalles del Animal: ");
        System.out.println("Especie: " + getEspecie());
    }

}
