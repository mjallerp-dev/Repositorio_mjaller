package repositorio_mjaller.poo_taller3_protocolocolaborativo;

class PruebaStatic {
    //public int contador; //Error: non-static variable this cannot be referenced from a static context
    static int contador = 0;

    public static void incrementar() {
        contador++;
        System.out.println("\nContador: " + contador);
    }

    public static void main(String[] args) {
        incrementar();
        
    }
}
    
    //Este error indica que debido a que la variable no es estática no puede ser referenciada en un contexto Estático
    //Los metódos estáticos solo pueden accedér a variables estáticas

    //Solución:
    //Para que la variable pueda ser referenciada debemos convertir la variable a Static

