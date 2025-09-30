package repositorio_mjaller.unidad2_poo.taller9;

public class Pez extends Animal{
    private String tipoAgua;

    public Pez(String especie, String tipoAgua) {
        super(especie);
        this.tipoAgua = tipoAgua;
    }

    public String getTipoAgua() {
        return this.tipoAgua;
    }

    @Override
    public void mostrarEspecie() {
        super.mostrarEspecie();
        System.out.println("Tipo de Agua: " + getTipoAgua());
    }

}
