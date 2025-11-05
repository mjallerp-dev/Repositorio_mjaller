package unidad4_poo.taller_17.ejercicio_2;

public class CuentaAhorros extends CuentaBancaria {
    private final double tasaInteres;

    public CuentaAhorros(String titular, String numeroCuenta, double saldo, double monto) {
        super(titular, numeroCuenta, saldo, monto);
        this.tasaInteres = 1.5; // Tasa de interés fija del 1.5% mensual
    }

    public double getTasaInteres() {
        return this.tasaInteres;
    }

    public void InteresGenerado() {
        System.out.println("""
            
            Calculando interés generado...

            Saldo actual: %.2f
            Tasa de interés mensual: %.2f%%

            Interés generado: %.2f

            """.formatted(getSaldo(), getTasaInteres(), (getSaldo() * tasaInteres) / 100));
    }
    
    @Override
    public void Transferir() {
        double saldoActualizado = getSaldo() - getMonto();
        System.out.println("""
            
            Saldo actual: %.2f

            Realizando transferencia desde Cuenta de Ahorros...

            Número de cuenta: %s
            Titular: %s
            Monto: %.2f
            
            Saldo actualizado: %.2f

            """.formatted(getSaldo(), getNumeroCuenta(), getTitular(), getMonto(), saldoActualizado));
    }

}
