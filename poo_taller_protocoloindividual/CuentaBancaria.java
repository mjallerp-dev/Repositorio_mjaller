package repositorio_mjaller.poo_taller_protocoloindividual;

public class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    public CuentaBancaria() {
        this.numeroCuenta = "123456789";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
        this.tipoCuenta = tipoCuenta;
    }

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public String getTipoCuenta() {
        return this.tipoCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Número de cuenta no especificado, se asignará '000000000'\n");
            this.numeroCuenta = "000000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        }
    }
    public void setSaldo(double saldo) {
        if (saldo < 0.0) { //Se comprueba si el saldo es negativo
            System.out.println("Saldo no válido, se asignará 0 por defecto\n");
            this.saldo = 0.0;
        } else {
            this.saldo = saldo;
        }
    }
    public void setTipoCuenta(String tipoCuenta) {
        if (tipoCuenta == null || tipoCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Tipo de cuenta no especificado, se asignará 'Desconocido'\n");
            this.tipoCuenta = "Desconocido";
        } else {
            this.tipoCuenta = tipoCuenta;
        }
    }

    @Override
    public String toString() {
        return
            "Número de cuenta: " + getNumeroCuenta() + "\n" +
            "Saldo actual: " + getSaldo() + "\n" +
            "Tipo de cuenta: " + getTipoCuenta() + "\n";
    }
}
