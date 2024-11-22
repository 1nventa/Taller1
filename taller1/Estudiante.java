package taller1;

public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante() {
        nombre = "Sin nombre";
        edad = 0;
        curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "Sin curso";
    }

    public Estudiante(String nombre, int edad, String curso) {
        this(nombre, edad);
        this.curso = curso;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Curso: " + curso);
    }
}