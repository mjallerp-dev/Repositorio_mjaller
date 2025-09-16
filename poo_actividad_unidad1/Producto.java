package repositorio_mjaller.poo_actividad_unidad1;

class Producto {
    String nombre;   
    double precio;   
    int stock;       

    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método default
    void mostrarInfo() {
        System.out.println("Nombre: " + nombre + 
                           ", Precio: " + precio + 
                           ", Stock: " + stock);
    }
}


