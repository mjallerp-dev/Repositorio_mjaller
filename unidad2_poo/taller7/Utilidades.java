package repositorio_mjaller.unidad2_poo.taller7;

public class Utilidades {

    public double sumar(int a, int b){
        return a + b;
    }
    public double restar(int a, int b){
        return a - b;
    }
    public double multiplicar(int a, int b){
        return a * b;
    }
    public double dividir(double a, double b){
        if ( b==0) {
            System.out.println("No es posible dividir entre 0");
            return Double.NaN;
        }
            else {
                return a / b;
        }
    }
}
