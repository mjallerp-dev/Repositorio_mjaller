package repositorio_mjaller.poo_taller3_protocolocolaborativo;

public class Coche {
    private String marca;
    private String modelo;
    static int contadorCoches = 0;

    public Coche(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void mostrarDetalles(){
        contadorCoches++;
        System.out.println("""
            
            Coche numero %d
            
            Marca: %s
            Modelo: %s
            """.formatted(contadorCoches,getMarca(),getModelo()));
    }

    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Mazda","Touring 2024");
        coche1.mostrarDetalles();
        Coche coche2 = new Coche("Chevrolet","Aveo");
        coche2.mostrarDetalles();
        coche1.setMarca("Toyota");
        coche1.setModelo("Prado");
        coche1.mostrarDetalles();
        coche2.setMarca("Renault");
        coche2.setModelo("Kweed");
        coche2.mostrarDetalles();
    }

}
