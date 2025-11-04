package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class PruebaMoto {
    public static void main(String[] args) {

        //Error: Marca has private acces in Moto, este error indica que no se puede acceder directamente a la propiedad.
        //Solo se puede acceder si la propiedad es publica.

        Moto moto1 = new Moto("Kawasaki");
        moto1.mostrarMoto();//Marca has private acces in Moto

        moto1.setMarca("Ducatti");
        moto1.mostrarMoto();
    }
}
