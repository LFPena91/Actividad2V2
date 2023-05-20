import Alumnos.Alumno;
import Asignaturas.Asignatura;

public class Main {
    public static void main(String[] args) {
        Asignatura LPOO = new Asignatura ("LPOO",0);
        Asignatura Calculo = new Asignatura("Calculo",0);
        Asignatura Fisica = new Asignatura("Fisica", 0);
        Asignatura Comunicaciones = new Asignatura("Comunicaciones", 0);

        Alumno Luis = new Alumno("Luis", 32);
        Alumno Juan = new Alumno("Juan", 25);
        Alumno Andrea = new Alumno("Andrea", 28);
    }
}