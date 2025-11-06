package unidad4_poo.taller_18.ejercicio_2;

public class CuentaBancaria implements Transferencia {

    @Override
    public void transferir(double monto, String cuentaDestino) {
        System.out.println("Enviando " + monto + " a la cuenta " + cuentaDestino + "...");
        System.out.println("Transferencia Exitosa.");
    }

}
