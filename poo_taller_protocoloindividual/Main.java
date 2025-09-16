package repositorio_mjaller.poo_taller_protocoloindividual;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Objeto de clase Estudiante
        System.out.println("\nBienvenido a la tienda online de la Biblioteca del colegio Comfenalco");
        System.out.println("\nApreciado estudiante, para iniciar con la compra ingrese sus datos a continuación");
        System.out.print("\nNombre y Apellido: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso (1 a 11): ");
        int curso = sc.nextInt();
        sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        
        System.out.println("\nDatos recibidos correctamente");

        //Objeto de clase CuentaBancaria
        System.out.println("\nIngrese datos de su cuenta bancaria: ");
        System.out.print("\nNúmero de cuenta (9 dígitos):");
        String numeroCuenta = sc.nextLine();
            while (numeroCuenta.length() !=9) {
                System.out.println("El numero de dígitos es inválido, por favor ingrese los 9 dígitos");
                numeroCuenta = sc.nextLine();
            }
        System.out.print("Saldo a recargar en su cuenta Biblioteca (min $10000): ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta,tipoCuenta);
        cuenta1.setSaldo(saldo);
        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, saldo, tipoCuenta);
        
        System.out.println("\nRecarga Exitosa: " + cuenta1);

        //Objeto de clase Libro
        System.out.println("\nIngrese los datos del libro que desea comprar: ");
        System.out.print("\nTitulo del Libro: ");
        String titulo = sc.nextLine();
        System.out.print("Autor: ");
        String autor = sc.nextLine();
        double valorlibro = 10000;    
        int numeroPaginas;
        while (true) { 
        System.out.print("Número de páginas (Edición): ");
            try {
                numeroPaginas = Integer.parseInt(sc.nextLine());
                if (numeroPaginas > 0) break;
                    System.out.println("Debe ser mayor que 0.");
                } catch (NumberFormatException e) {
                    System.out.println("Debe ingresar un número válido.");
                 }
                }
        System.out.println("Valor a pagar :" + valorlibro);  
        Libro libro1 = new Libro(titulo,autor,numeroPaginas);
        Libro libro2 = new Libro("Viaje al Centro de la Tierra","Julio Verne",1200);
        Libro libro3 = new Libro();

        //Mostrar los objetos
        System.out.println("\nCompra Exitósa, datos de su compra: \n");
        System.out.println(estudiante);
        System.out.println(libro1);
        cuenta2.setSaldo(saldo-valorlibro);
        System.out.println("\nDatos con saldo nuevo : \n" + cuenta2);

        //Usando un text block
        System.out.println("""            
               
            _____________________________________________________________
            Tambien te podria interesar
            %s
            %s

            Transaccioón Finalizada
            """.formatted(libro2, libro3));

        sc.close();

    }
}
