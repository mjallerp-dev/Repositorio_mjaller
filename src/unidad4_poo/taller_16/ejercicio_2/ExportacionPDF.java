package unidad4_poo.taller_16.ejercicio_2;

public class ExportacionPDF extends Documento {

    public ExportacionPDF(String fileName) {
        super(fileName);
    }
    
    @Override
    public void exportar(String fileName) {
        System.out.println("""

            Exportando %s como PDF...
            %s.pdf exportado exitosamente.
            """.formatted(getFileName(), getFileName()));
    }

}
