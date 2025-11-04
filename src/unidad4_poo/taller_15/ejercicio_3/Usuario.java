package unidad4_poo.taller_15.ejercicio_3;

public class Usuario {
    private final String email;
    private final String contrasena;

    public Usuario(String email, String contrasena) {
        this.email = email;
        this.contrasena = contrasena;
    }

    public String getEmail() {
        return this.email;
    }
    public String getcontrasena() {
        return this.contrasena;
    }

    public boolean autenticar() {
        if (getEmail().equals("admin") && getcontrasena().equals("12345678")) {
            System.out.println("Autenticación exitosa.");
            return true;
        } else{
            System.out.println("Error de autenticación: Email y/o contrasena incorrecto/a.");
            return false;
        }
    }

    public boolean validar() {
        if (getEmail().contains("@") && getEmail().contains(".") && getcontrasena().length() >= 8) {
            return true;
        } else{
            if (!getEmail().contains("@") && !getEmail().contains(".") && getcontrasena().length() < 8) {
                System.out.println("Email y/o contrasena inválido/a.");
            }
            else if (!getEmail().contains("@") && !getEmail().contains(".")) {
                System.out.println("Error: Email inválido, debe contener '@' y '.'");
            }
            else if (getcontrasena().length() < 8) {
                System.out.println("Error: contrasena inválida, debe tener al menos 8 caracteres.");
            }
            return false;
        }
    }
}
