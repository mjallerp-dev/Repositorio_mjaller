package unidad4_poo.taller_19.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoLocal);
        gestorArchivos.generar("pdf", "Documentos");

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        gestorArchivos = new GestorArchivos(almacenamientoNube);
        gestorArchivos.generar("xlsx", "Reportes Excel OneDrive");
        
    }

}
