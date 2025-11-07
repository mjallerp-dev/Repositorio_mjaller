package unidad4_poo.taller_15.ejercicio_3;

public class Main {

    public static void main(String[] args) {
        Usuario usuario1 = new Usuario("admi@mail.com", "12345687");

        ValidationService validationService = new ValidationService();
        AutenticationService autenticationService = new AutenticationService();

        if (validationService.validar(usuario1)){
            if (autenticationService.autenticar(usuario1)) {
                System.out.println("""
                    
                Autenticación exitosa
                
                Bienvenido/a al sistema %s

                """.formatted(usuario1.getEmail()));
            } else {
                System.out.println("Error de autenticación: Email y/o contraseña incorrecto/a.");
            }
        } else {
            System.out.println("""

                Email y/o contraseña inválido/a.

                El email debe contener '@' y '.'.
                La contraseña debe tener al menos 8 caracteres.

                """);
        }
    }
}