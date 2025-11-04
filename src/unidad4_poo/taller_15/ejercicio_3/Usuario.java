package unidad4_poo.taller_15.ejercicio_3;

public class Usuario {
    private String email;
    private String contraseña;

    public Usuario(String email, String contraseña) {
        this.email = email;
        this.contraseña = contraseña;
    }

    public boolean autenticar() {
        if (this.email.equals("admin") && this.contraseña.equals("12345678")) {
            System.out.println("Autenticación exitosa.");
            return true;
        } else{
            System.out.println("Error de autenticación: Email y/o contraseña incorrecto/a.");
            return false;
        }
    }

    public boolean validar() {
        if (this.email.contains("@") && this.email.contains(".") && this.contraseña.length() >= 8) {
            return true;
        } else{
            if (!this.email.contains("@") && !this.email.contains(".") && this.contraseña.length() < 8) {
                System.out.println("Email y/o contraseña inválido/a.");
            }
            else if (!this.email.contains("@") && !this.email.contains(".")) {
                System.out.println("Error: Email inválido, debe contener '@' y '.'");
            }
            else if (this.contraseña.length() < 8) {
                System.out.println("Error: Contraseña inválida, debe tener al menos 8 caracteres.");
            }
            return false;
        }
    }
}
