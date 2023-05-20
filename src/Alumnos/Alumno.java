package Alumnos;

public class Alumno {
    private static String nombre;
    private static int edad;
    public void Alumno(String nombre, int edad){//constructor de alumnos
        this.nombre = nombre;
        this.edad = edad;
    }
    //Agrego getters and setters
    public static String getNombre() {
        return nombre;
    }
    public static void setNombre(String nombre) {
        Alumno.nombre = nombre;
    }
    public static int getEdad() {
        return edad;
    }
    public static void setEdad(int edad) {
        Alumno.edad = edad;
    }
}
