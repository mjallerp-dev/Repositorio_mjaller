package unidad4_poo.taller_19.ejercicio_1;

public class Main {

    public static void main(String[] args) {
        
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal();
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacion.autenticar("admin@mail.com", "12345678");

        ServicioAutenticacion autenticacionOAuth = new AutenticacionOAuth();
        gestorAutenticacion = new GestorAutenticacion(autenticacionOAuth);
        gestorAutenticacion.autenticar("admin@google.com","123456");

    }

}
