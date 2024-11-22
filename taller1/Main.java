package taller1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Libro libro1 = new Libro();
        libro1.mostrarDetalles();

        System.out.print("Ingrese título del libro: ");
        String titulo = scanner.nextLine();
        System.out.print("Ingrese autor del libro: ");
        String autor = scanner.nextLine();
        System.out.print("Ingrese número de páginas: ");
        int numeroPaginas = scanner.nextInt();
        Libro libro2 = new Libro(titulo, autor, numeroPaginas);
        libro2.mostrarDetalles();

        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.mostrarDetalles();

        System.out.print("Ingrese número de cuenta: ");
        String numeroCuenta = scanner.next();
        System.out.print("Ingrese tipo de cuenta: ");
        String tipoCuenta = scanner.next();
        CuentaBancaria cuenta2 = new CuentaBancaria(numeroCuenta, tipoCuenta);
        cuenta2.mostrarDetalles();

        Estudiante estudiante1 = new Estudiante();
        estudiante1.mostrarDetalles();

        System.out.print("Ingrese nombre del estudiante: ");
        String nombre = scanner.next();
        System.out.print("Ingrese edad del estudiante: ");
        int edad = scanner.nextInt();
        System.out.print("Ingrese curso del estudiante: ");
        String curso = scanner.next();
        Estudiante estudiante2 = new Estudiante(nombre, edad, curso);
        estudiante2.mostrarDetalles();

        scanner.close();
    }
}