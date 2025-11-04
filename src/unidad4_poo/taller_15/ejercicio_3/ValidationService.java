package unidad4_poo.taller_15.ejercicio_3;

public class ValidationService {

    public boolean validar(Usuario u) {
        if (u.getEmail().contains("@") && u.getEmail().contains(".") && u.getcontrasena().length() >= 8) {
            return true;
        } else{
            if (!u.getEmail().contains("@") && !u.getEmail().contains(".") && u.getcontrasena().length() < 8) {
                System.out.println("Email y/o contrasena inválido/a.");
            }
            else if (!u.getEmail().contains("@") && !u.getEmail().contains(".")) {
                System.out.println("Error: Email inválido, debe contener '@' y '.'");
            }
            else if (u.getcontrasena().length() < 8) {
                System.out.println("Error: contrasena inválida, debe tener al menos 8 caracteres.");
            }
            return false;
        }
    }
}
