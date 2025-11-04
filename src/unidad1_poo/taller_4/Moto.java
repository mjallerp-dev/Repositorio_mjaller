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
        if (marca==null || marca.trim().isEmpty()){
            System.out.println("Marca no especificada o inválida, se le asiganará 'Desconocida' por defecto");
            this.marca = "Desconocida";
        }
        else {this.marca = marca;
        }
        
    }

    public void mostrarMoto() {
        System.out.println("""
                
                Detalles de la Moto:
                Marca: %s

                """.formatted(getMarca()));
    }
}
