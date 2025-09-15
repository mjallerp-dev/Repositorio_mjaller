package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class PruebaVelocidad {
    public static void main(String[] args) {
        
        Coche coche1 = new Coche("Toyota","Prado",150);

        //Error: Marca has private acces in Coche, este error indica que no se puede acceder directamente a la propiedad.
        //Solo se puede acceder si la propiedad es publica.
        //coche1.marca = "Mazda"; marca has private acces in Coche
        //coche1.modelo ="Touring";
        coche1.mostrarDetalles();
        coche1.acelerar(-1);
        coche1.mostrarDetalles();
        coche1.acelerar(20);
        coche1.mostrarDetalles();
    }

}
