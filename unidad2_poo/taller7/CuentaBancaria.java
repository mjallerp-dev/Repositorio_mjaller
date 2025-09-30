package repositorio_mjaller.unidad2_poo.taller7;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    public String tipoCuenta;

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        if (saldo<0.0) {
            System.out.println("El saldo no puede ser negativo, se asignara 0 por defecto");
            this.saldo=0.0;
        }
        else
        this.saldo = saldo;
    }

    public void mostrarDetalles() {
        System.out.println("\nDetalles de la Cuenta Bancaria: ");
        System.out.println("Numero de Cuenta: " + this.numeroCuenta);
        System.out.println("Tipo de Cuenta: " + this.tipoCuenta);
        System.out.println("Saldo: " + getSaldo());
    }
}    