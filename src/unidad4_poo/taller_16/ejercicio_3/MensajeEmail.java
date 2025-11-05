package unidad4_poo.taller_16.ejercicio_3;

public class MensajeEmail extends Mensajero {

    @Override
    public void enviar(String mensaje) {
        System.out.println("Enviando Email: " + mensaje);
    }



}
