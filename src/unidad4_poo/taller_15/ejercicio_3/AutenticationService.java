package unidad4_poo.taller_15.ejercicio_3;

public class AutenticationService {

    public boolean autenticar(Usuario u) {
        return u.getEmail().equals("admin@mail.com") && u.getcontrasena().equals("12345678");
    }
}
