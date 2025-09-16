package repositorio_mjaller.poo_actividad_unidad1;

import repositorio_mjaller.poo_actividad_unidad1.vehiculos.*;

class PruebaVehiculos {
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("camioneta");
        Moto moto1 = new Moto("Deportiva");

    }

    //Hay un eeror de compilación porque default no es visible desde otro paquete
    //Para poder acceder, la clase de prueba debe estar dentro del mismo paquete Vehiculos

}
