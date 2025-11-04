package unidad4_poo.taller_15.ejercicio_3;

public class AutenticationService {

    public boolean autenticar(Usuario u) {
        if (u.getEmail().equals("admin") && u.getcontrasena().equals("12345678")) {
            System.out.println("Autenticación exitosa.");
            return true;
        } else{
            System.out.println("Error de autenticación: Email y/o contrasena incorrecto/a.");
            return false;
        }
    }
}
