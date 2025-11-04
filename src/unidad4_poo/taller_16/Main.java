package unidad4_poo.taller_16;

public class Main {

    public static void main(String[] args) {

        DescuentoFijo descuentoFijo = new DescuentoFijo(200, 30);
        descuentoFijo.aplicarDescuento();
        descuentoFijo.setMonto(250);
        descuentoFijo.aplicarDescuento();

        DescuentoPorcentaje descuentoPorcentaje = new DescuentoPorcentaje(200, 15);
        descuentoPorcentaje.aplicarDescuento();
        descuentoPorcentaje.setPorcentaje(110);
        descuentoPorcentaje.aplicarDescuento();
    }

}
