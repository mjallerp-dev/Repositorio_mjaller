package repositorio_mjaller.unidad2_poo.taller8;

public class PruebaPrivate extends Moto {
    public String modelo;

    public PruebaPrivate(String marca, int velocidadMaxima, String modelo) {
        super(marca, velocidadMaxima);
        this.modelo = modelo;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("\nDetalles de la Moto: ");
        //System.out.println("Marca: " + super.marca); marca has private access in Moto
        //System.out.println("Velocidad Maxima: " + super.velocidadMaxima); velocidadMaxima has private access in Moto
        //No es posible acceder directamente a las propiedades privadas de la clase padre
        //Solucion: Cambiar el acceso de private a protected en la clase padre
        //Solucion 2: Crear metodos get para acceder a las propiedades privadas
        System.out.println("Marca: " + getMarca());
        System.out.println("Velocidad Maxima: " + getVelocidadMaxima());
        System.out.println("Modelo: " + this.modelo);
    }

    public static void main(String[] args) {
        PruebaPrivate moto1 = new PruebaPrivate("Yamaha", 240, "MT09");
        Moto moto2 = new Moto("Honda", 220);
        moto2.mostrarDetalles();
        moto1.mostrarDetalles();
    }
}
