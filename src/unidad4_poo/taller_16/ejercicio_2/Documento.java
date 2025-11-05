package unidad4_poo.taller_16.ejercicio_2;

public abstract class Documento {
    private String fileName;

    public Documento(String fileName) {
        this.fileName = fileName;
    }

    public void exportarPDF() {
        System.out.println("""

            Exportando %s como PDF...
            PDF exportado exitosamente.
            """.formatted(this.fileName));
    }
}
