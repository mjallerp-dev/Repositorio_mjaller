package repositorio_mjaller.poo_taller3_protocolocolaborativo;

public class Matemáticas {


    static int sumar(int a, int b){
        return a + b;
    }
    static int restar(int a, int b){
        return a - b;
    }
    static int multiplicar(int a, int b){
        return a * b;
    }
    static double dividir(double a, double b){
        if ( b==0) {
            throw new ArithmeticException("No es posible dividir entre 0");
        }
            else {
                return a / b;
        }
    }
}
