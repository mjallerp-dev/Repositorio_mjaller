package unidad4_poo.taller_16.ejercicio_2;

public abstract class Documento {
    private String fileName;

    public Documento(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        if (fileName == null || fileName.trim().isEmpty()) {
            System.out.println("El nombre del archivo no puede estar vacío, se asiganará 'documento' por defecto.");
            this.fileName = "documento";
        } else {
            this.fileName = fileName;
        }
    }

    public void exportarPDF() {
        System.out.println("""

            Exportando %s como PDF...
            %s.pdf exportado exitosamente.
            """.formatted(this.fileName));
    }
}
