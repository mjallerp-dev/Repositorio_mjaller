package repositorio_mjaller.unidad2_poo.taller10;

public class Ave extends Animal {
    private String color;

    public Ave(String especie, String color) {
        super(especie);
        this.especie = especie;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public void hacerSonido() {
        System.out.println("El " + getEspecie() + "de Color " + getColor() + "canta.");
    }
}
