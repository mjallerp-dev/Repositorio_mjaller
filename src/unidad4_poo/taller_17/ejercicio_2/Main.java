package unidad4_poo.taller_17.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        
        CuentaBancaria cuenta1 =new CuentaBancaria("Miguel Jaller", "987654321", 500000, 150000);
        cuenta1.Transferir();

        CuentaBancaria cuenta2 = new CuentaAhorros("Angel Piñeres", "123456789", 2000000, 250000);
        cuenta2.Transferir();

        CuentaAhorros cuenta3 = new CuentaAhorros("Angel Piñeres", "123456789", 2000000, 250000);
        cuenta3.Transferir();
        cuenta3.InteresGenerado();
    }

}
