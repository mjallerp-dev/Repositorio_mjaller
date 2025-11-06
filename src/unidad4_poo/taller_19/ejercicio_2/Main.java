package unidad4_poo.taller_19.ejercicio_2;

public class Main {

    public static void main(String[] args) {
        
        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal();
        GestorArchivos gestorArchivos = new GestorArchivos(almacenamientoLocal);
        gestorArchivos.guardar("Archivo.csv", "Documentos");
        gestorArchivos.recuperar("ArchivoBorrado.xlsx", "Papelera de Reciclaje");

        Almacenamiento almacenamientoNube = new AlmacenamientoNube();
        gestorArchivos = new GestorArchivos(almacenamientoNube);
        gestorArchivos.guardar("Documento.pdf", "Documentos de OneDrive");
        gestorArchivos.recuperar("DocumentoBorrado.docx", "Papelera de Gooogle Drive");
        
    }

}
