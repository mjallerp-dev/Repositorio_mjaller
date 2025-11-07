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

    public void mostrarDatos() {
        System.out.println("""

            Datos del usuario:

            Email: %s
            Contraseña: %s

                   
            """.formatted(getEmail(),getcontrasena()));
    }
}
