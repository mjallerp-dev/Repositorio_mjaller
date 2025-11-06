package unidad4_poo.taller_19.ejercicio_1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion (ServicioAutenticacion servicioAutenticacion){
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticar(String email, String contrasena){
        servicioAutenticacion.autenticarUsuario(email, contrasena);
    }
}
