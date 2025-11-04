package unidad4_poo.taller_15.ejercicio_3;

public class ValidationService {

    public boolean validar(Usuario u) {
        return u.getEmail().contains("@") && u.getEmail().contains(".") && u.getcontrasena().length() >= 8;
    }
}
