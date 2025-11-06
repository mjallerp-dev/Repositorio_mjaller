package unidad4_poo.taller_19.ejercicio_1;

public class AutentiacionOAuth implements ServicioAutenticacion {

    @Override
    public boolean autenticarUsuario(String email, String contrasena){
        System.out.println("Redirigiendo al proveedor OAuth para autenticar usuario");
        System.out.println("Autenticación Exitosa");
        return true;
    }   
}
