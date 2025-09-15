package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

    public Coche(String marca, String modelo, int velocidadMaxima){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public int getVelocidadMaxima(){
        return this.velocidadMaxima;
    }

    public void mostrarDetalles(){
        System.out.println("""
                
        Datos del vehículo:

        Marca: %s
        Modelo: %s
        Velocidad Maxima: %d

        """.formatted(getMarca(),getModelo(),getVelocidadMaxima()));
    }

}
