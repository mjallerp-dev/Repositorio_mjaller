package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class Moto {
    private String marca;

    public Moto(String marca){
        this.marca = marca;
    }

    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public void mostrarDetalles() {
        System.out.println("""
                
                Detalles de la Moto:
                Marca: %s
                
                """.formatted(getMarca()));
    }
}
