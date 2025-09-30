package repositorio_mjaller.poo_taller4_protocolocolaborativo;

public class PruebaPerro {
    public static void main(String[] args) {
        
        Perro perro1 = new Perro("Labrador","Blanco",3);
        perro1.mostrarPerro();
        //perro1.raza = "Pitbull"
        //Aunque no hayan metodos get y set no se puede acceder directamente a la propiedad por ser privada.
        //Es decir, la protección de datos no se ve afectada aunque no existan estos metodos mientras las propiedades sean privadas.
        Perro perro2 = new Perro(null,"",-5);
        perro2.mostrarPerro();
        //Al no haber metodos set con validaciones se puede colocar cualquier espacio en blanco o vacio en las variables raza y color.
        //Asi mismo se puede colocar una edad negativa o 0 lo cual no tiene sentido.
        //Los metodos set son importantes para poder actualizar las variables y validar los datos ingresados.
    }
}
