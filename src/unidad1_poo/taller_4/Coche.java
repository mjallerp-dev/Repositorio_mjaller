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
    public void setMarca(String marca){
        if (marca==null || marca.trim().isEmpty()){
            System.out.println("Marca no especificada o inválida, se le asiganará 'Desconocida' por defecto");
            this.marca = "Desconocida";
        }
        else {this.marca = marca;
        }
        
    }
    public void setModelo(String modelo){
        if (marca==null || marca.trim().isEmpty()){
            System.out.println("Marca no especificada o inválida, se le asiganará 'Desconocida' por defecto");
            this.marca = "Desconocida";
        }
        else {this.modelo = modelo;
        }
        
    }
    public void setModelo(int velocidadMaxima){
        if (velocidadMaxima<1){
            System.out.println("Velocidad Máxima no especificada o inválida, se le asiganará '1' por defecto");
            this.velocidadMaxima = 1;
        }
        else {this.velocidadMaxima = velocidadMaxima;
        }
        
    }

    public void acelerar(int aceleracion){
        if (aceleracion>0){
            this.velocidadMaxima = velocidadMaxima + aceleracion;
            System.out.println("El Coche ha acelerado: " + aceleracion + "Km/h");
        }
        else{
            System.out.println("La aceleración debe ser positiva.");
        }
    }

    public void mostrarDetalles(){

        System.out.println("""
                
        Datos del vehículo:

        Marca: %s
        Modelo: %s
        Velocidad Maxima: %d Km/h

        """.formatted(getMarca(),getModelo(),getVelocidadMaxima()));
    }

}
