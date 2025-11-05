package unidad4_poo.taller_17.ejercicio_2;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String titular;

    public CuentaBancaria(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void Transferencia(){
        System.out.println("Realizando transferencia hacia cuenta: " + getNumeroCuenta());
    }

}
