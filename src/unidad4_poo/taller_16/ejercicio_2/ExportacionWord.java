package unidad4_poo.taller_16.ejercicio_2;

public class ExportacionWord extends Documento {

    public ExportacionWord(String fileName) {
        super(fileName);
    }

    @Override
    public void exportar(String fileName) {
        System.out.println("""

            Exportando %s como Word...
            %s.docx exportado exitosamente.
            """.formatted(getFileName(), getFileName()));
    }

}
