package unidad4_poo.taller_18.ejercicio_2;

public class Cajero implements Retiro {

    @Override
    public void retirar(double monto, String numeroCuenta) {
        System.out.println("\nRealizando retiro desde el Cajero Automático...");
        System.out.println("\nRetirando " + monto + " de su cuenta " + numeroCuenta + "...");
        System.out.println("\nRetiro exitoso, tome su dinero.");
    }

}
