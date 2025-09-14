package repositorio_mjaller.poo_taller_protocoloindividual;

public class CuentaBancaria {
    //Propiedades
    private String numeroCuenta; //Solo contiene numeros pero no es operable
    private int saldo;
    private String tipoCuenta;

    //1. Constructor por defecto
    public CuentaBancaria() {
        this.numeroCuenta = "123456789";
        this.saldo = 10000000;
        this.tipoCuenta = "Ahorros";
    }

    //2. Constructor parametrizado
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        //Validaciones
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Número de cuenta no especificado, se asignará '000000000'\n");
            this.numeroCuenta = "000000000";
        } else {
            this.numeroCuenta = numeroCuenta;
        }
        if (tipoCuenta == null || tipoCuenta.trim().isEmpty()) { //Se comprueba si la variable es nula o vacia
            System.out.println("Tipo de cuenta no especificado, se asignará 'Desconocido'\n");
            this.tipoCuenta = "Desconocido";
        } else {
            this.tipoCuenta = tipoCuenta;
        }
    }

}
