package repositorio_mjaller.unidad2_poo.taller7;

public class PruebaCuenta {

    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("123456", 500.0, "Ahorros");
        CuentaBancaria cuenta2 = new CuentaBancaria("654321", 1500.0, "Corriente");
        //cuenta1.numeroCuenta = "123456"; numeroCuenta has private access in CuentaBancaria
        //El atributo saldo es privado, no se puede acceder directamente
        cuenta1.mostrarDetalles();
        cuenta2.mostrarDetalles();
        cuenta1.setSaldo(-200.0);
        cuenta2.setSaldo(300.0);
        cuenta1.mostrarDetalles();
        cuenta2.mostrarDetalles();
    }

}
