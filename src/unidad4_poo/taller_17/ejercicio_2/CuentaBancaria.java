package unidad4_poo.taller_17.ejercicio_2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;
    private double monto;

    public CuentaBancaria(String numeroCuenta, double saldo, String titular, double monto) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.titular = titular;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTitular() {
        return this.titular;
    }
    public double getMonto() {
        return this.monto;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) {
            System.out.println("El número de cuenta no puede estar vacío, transaccion rechazada.");
        } else {
        this.numeroCuenta = numeroCuenta;}
    }
    public void setSaldo(double saldo) {
        if (saldo < 0) {
            System.out.println("El saldo no puede ser negativo, transaccion rechazada.");
        } else {
        this.saldo = saldo;}
    }
    public void setTitular(String titular) {
        if (titular == null || titular.trim().isEmpty()) {
            System.out.println("El nombre del titular no puede estar vacío, transaccion rechazada.");
        } else {
        this.titular = titular;}
    }
    public void setMonto(double monto) {
        if (monto < 0) {
            System.out.println("El monto no puede ser negativo, transaccion rechazada.");
        } else {
        this.monto = monto;}
    }

    public void Transferencia(){
        System.out.println("""
            
            Realizando transferencia...

            Número de cuenta: %s
            Titular: %s
            Monto: %.2f

            Saldo actualizado: %.2f

                
            """.formatted(getNumeroCuenta(), getTitular(), getMonto(), getSaldo()));
    }

}
