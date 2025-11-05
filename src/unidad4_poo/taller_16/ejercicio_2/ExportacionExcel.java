package unidad4_poo.taller_16.ejercicio_2;

public class ExportacionExcel extends Documento {

    public ExportacionExcel(String fileName) {
        super(fileName);
    }

    @Override
    public void exportar(String fileName) {
        System.out.println("""

            Exportando %s como Excel...
            %s.xlsx exportado exitosamente.
            """.formatted(getFileName(), getFileName()));
    }

}
