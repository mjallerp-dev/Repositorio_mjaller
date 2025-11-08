package unidad4_poo.taller_19.ejercicio_1;

public class AutenticacionLocal implements ServicioAutenticacion {

    @Override
    public boolean autenticarUsuario(String email, String contrasena){
        if ("admin@mail.com".equals(email) && "12345678".equals(contrasena)){
            System.out.println("Autenticación exitosa.");
            return true;
        }
        else {
            System.out.println("Autenticacion fallida.");
            return false;
        } 
    }   
}
