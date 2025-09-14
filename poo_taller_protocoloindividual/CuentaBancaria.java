package repositorio_mjaller.poo_taller_protocoloindividual;

public class CuentaBancaria {
    //Propiedades
    private String numeroCuenta; //Solo contiene numeros pero no es operable
    private double saldo;
    private String tipoCuenta;

    //1. Constructor por defecto

    public CuentaBancaria() {
        this.numeroCuenta = "123456789";
        this.saldo = 0.0;
        this.tipoCuenta = "Ahorros";
    }

    //2. Constructor parametrizado con 2 parametros

    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        //Validaciones
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Número de cuenta no especificado, se asignará '000000000'\n");
            this.numeroCuenta = "000000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0; //El saldo se inicializa en 0
        }
        if (tipoCuenta == null || tipoCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Tipo de cuenta no especificado, se asignará 'Desconocido'\n");
            this.tipoCuenta = "Desconocido";
        } else {
            this.tipoCuenta = tipoCuenta;
        }
    }

    //3. Constructor sobrecargado con 3 parametros

    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {

        this.numeroCuenta = numeroCuenta;
        //Validaciones
         
        if (saldo < 0) { //Se comprueba si el saldo es negativo
            System.out.println("Saldo no válido, se asignará 0 por defecto\n");
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
        if (tipoCuenta == null || tipoCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Tipo de cuenta no especificado, se asignará 'Desconocido'\n");
            this.tipoCuenta = "Desconocido";
        } else {
            this.tipoCuenta = tipoCuenta;
        }
    }

    //4. Metodos get y set

    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String getTipoCuenta() {
        return tipoCuenta;
    }
    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    //Metodos mostrarDatos
    @Override
    public String toString() {
        return
            "Número de cuenta: " + getNumeroCuenta() + "\n" +
            "Saldo: " + getSaldo() + "\n" +
            "Tipo de cuenta: " + getTipoCuenta() + "\n";    
    }
}
