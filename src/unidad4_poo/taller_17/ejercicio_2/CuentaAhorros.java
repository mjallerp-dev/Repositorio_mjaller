package unidad4_poo.taller_17.ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {
    private double tasaInteres;

    public CuentaAhorros(String numeroCuenta, double saldo, String titular, double monto, double tasaInteres) {
        super(numeroCuenta, saldo, titular, monto);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return this.tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        if (tasaInteres < 0) {
            System.out.println("La tasa de interés no puede ser negativa, transaccion rechazada.");
        } else {
        this.tasaInteres = tasaInteres;}
    }

    @Override
    public void Transferir() {
        System.out.println("""
            
            Realizando transferencia desde Cuenta de Ahorros...

            Número de cuenta: %s
            Titular: %s
            Monto: %.2f
            Tasa de interés: %.2f%%

            Saldo actualizado: %.2f - %.2f%%
            """.formatted(getNumeroCuenta(), getTitular(), getMonto(), getTasaInteres(), getSaldo(), getTasaInteres()));
    }

}
