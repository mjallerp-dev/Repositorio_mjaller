package repositorio_mjaller.poo_actividad_unidad1;

class Bancolombia extends Banco {

    public Bancolombia(double saldo) {
        super(saldo);
    }

    public void AumentarSaldo() {
        this.saldo = 2000000.000;
    }

    //Cuando la propiedad saldo se define como protected cualquier subclase puede acceder y modificar directamente el saldo.
    //Se rompe el principio de encapsulamiento

    //Solucion: Colocar saldo como Private en Banco y crear metodos controlados para modificar

    public void mostrarSaldo(){
        System.out.println("\nSu saldo es de " + this.saldo);
    }

    public static void main(String[] args) {
        
        Bancolombia bcol = new Bancolombia(100000);
        bcol.mostrarSaldo();
        bcol.AumentarSaldo();
        bcol.mostrarSaldo();
    }

}
