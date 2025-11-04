package repositorio_mjaller.unidad2_poo.taller7;

public class PruebaUtilidades {

    public static void main(String[] args) {

        //double operacion = Utilidades.sumar(10, 4); non-static method sumar(int,int) cannot be referenced from a static context
        //System.out.println("El resultado de la resta es: " + operacion);
        // No se puede llamar a los metodos directamente adebido a que no son estaticos 
        //Solucion 1: Crear un objeto de la clase Utilidades para llamar a los métodos no estáticos
        //Solucion 2: Hacer los métodos estáticos en la clase Utilidades

        Utilidades Utilidades = new Utilidades();

        double operacion1 = Utilidades.sumar(5, 3);
        System.out.println("El resultado de la suma es: " + operacion1);
        double operacion2 = Utilidades.restar(10, 4);
        System.out.println("El resultado de la resta es: " + operacion2);
        double operacion3 = Utilidades.multiplicar(2, 6);
        System.out.println("El resultado de la multiplicación es: " + operacion3);
        double operacion4 = Utilidades.dividir(8, 0);
        System.out.println("El resultado de la división es: " + operacion4);
        double operacion5 = Utilidades.dividir(8, 2);
        System.out.println("El resultado de la división es: " + operacion5);
    }

}
