import Asignaturas.Asignatura;
import Asignaturas.LPOO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner notaS = new Scanner(System.in);
        Asignatura LPOO = new LPOO(0);
        LPOO.nombre();
        System.out.println("Ingrese la nota:");
        Asignaturas.LPOO.setNota(notaS.nextDouble());
        System.out.println("Su nota es: " + Asignaturas.LPOO.getNota());
    }
}