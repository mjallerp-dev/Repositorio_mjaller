package repositorio_mjaller.poo_taller3_protocolocolaborativo;

public class PruebaStatic {
    private int contador; 

    public static void incrementar() {
        contador++;
    }

    public static void main(String[] args) {
        incrementar();
    }
    
    //Error: non-static variable this cannot be referenced from a static context
    //Este error indica que debido a que la variable no es estática no puede ser referenciada en un contexto Estático
    //Los metódos estáticos solo pueden accedér a variables estáticas

    //Solución 1:
    //Para que la variable pueda ser referenciada debemos convertir la variable a Static

    //Solucion 2:
    //El metodo para mostrar las variable que NO son estáticas tampoco debe ser un método de instancia
    

}
