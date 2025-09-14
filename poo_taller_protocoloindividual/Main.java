package repositorio_mjaller.poo_taller_protocoloindividual;

import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Objeto de clase Libro
        System.out.println("Inicializar objeto Libro \nIngrese los datos del libro: ");
        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Número de páginas: ");
        int numeroPaginas = sc.nextInt();
        Libro libro1 = new Libro(titulo,autor,numeroPaginas);
        Libro libro2 = new Libro("Cien años de soledad","Gabriel Garcia Marquez",471);
        Libro libro3 = new Libro();

        //Objeto de clase CuentaBancaria
        System.out.println("\nIngrese datos de la cuenta bancaria:");
        System.out.print("Número de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.print("Saldo: ");
        double saldo = sc.nextDouble();
        sc.nextLine();
        System.out.print("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        CuentaBancaria cuenta2 = new CuentaBancaria();
        CuentaBancaria cuenta3 = new CuentaBancaria(numeroCuenta,tipoCuenta);
        CuentaBancaria cuenta1 = new CuentaBancaria(numeroCuenta, saldo, "Ahorros");

        //Objeto de clase Estudiante
        System.out.println("\nIngrese datos del estudiante:");
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();
        Estudiante estudiante = new Estudiante(nombre, edad, curso);

        //Mostrar los objetos
        System.out.println("\nDatos ingresados\n");
        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(cuenta1);
        System.out.println(cuenta2);
        System.out.println(cuenta3);
        System.out.println(estudiante);

        sc.close();

    }
}
