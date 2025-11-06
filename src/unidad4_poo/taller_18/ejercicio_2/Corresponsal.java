package unidad4_poo.taller_18.ejercicio_2;

public class Corresponsal implements PagoDeFacturas {

    @Override
    public void pagarFactura(double monto, String numeroConvenio){
        System.out.println("Valor a pagar: $" + monto);
        System.out.println("Pago realizado correctamente al convenio " + numeroConvenio);
    }

}
