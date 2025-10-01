package repositorio_mjaller.unidad2_poo.taller10;

public class Perro extends Animal {
    private String raza;

    public Perro(String especie, String raza) {
        super(especie);
        this.raza = raza;
    }
    public String getRaza() {
        return this.raza;
    }

    public void sonido() {
        super.sonido();
        System.out.println("\nEl " + getEspecie() + " de raza " + getRaza() + " ladra.");
    }
}
