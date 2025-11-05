package unidad4_poo.taller_16.ejercicio_3;

public class Main {

    public static void main(String[] args) {
        Mensajero mensajeroEmail = new MensajeEmail();
        Mensajero mensajeroSMS = new MensajeSMS();
        Mensajero mensajeroPush = new MensajePush();

        mensajeroEmail.enviar("\nHola, este es un mensaje por correo electrónico.");
        mensajeroSMS.enviar("\nHola, este es un mensaje por SMS.");
        mensajeroPush.enviar("\nHola, esta es una notificación Push.");
    }

}
