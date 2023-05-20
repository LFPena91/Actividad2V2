package Alumnos;

import Asignaturas.Asignatura;

public class Alumno {
    private static String nombre;
    private static int edad;
    public Alumno(String nombre, int edad){//constructor de alumnos
        this.nombre = nombre;
        this.edad = edad;
    }
    //Agrego getters and setters
    public static String getNombre() {
        return nombre;
    } //consultar el nombre
    public static int getEdad() {
        return edad;
    } //consultar la edad
    public static void setEdad(int edad) {
        Alumno.edad = edad;
    } //asignar la edad

}
