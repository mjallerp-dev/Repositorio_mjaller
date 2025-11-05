package unidad4_poo.taller_17.ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {
    private final double tasaInteres;

    public CuentaAhorros(String titular, String numeroCuenta, double saldo,  double monto, double tasaInteres) {
        super(titular, numeroCuenta, saldo, monto);
        this.tasaInteres = 3;
    }

    public double getTasaInteres() {
        return this.tasaInteres;
    }

    @Override
    public void Transferir() {
        double saldoactualizado = getSaldo() - getMonto() - (getMonto() * getTasaInteres() / 100);
        System.out.println("""
            
            Saldo actual: %.2f

            Realizando transferencia desde Cuenta de Ahorros...

            Número de cuenta: %s
            Titular: %s
            Monto: %.2f
            Tasa de interés: %.2f%

            Saldo actualizado: %.2f

            """.formatted(getSaldo(), getNumeroCuenta(), getTitular(), getMonto(), getTasaInteres(), saldoactualizado));
    }

}
