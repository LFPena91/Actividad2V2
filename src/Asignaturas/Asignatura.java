package Asignaturas;

public class Asignatura {
    private static double nota;
    private static String materia;
    public Asignatura(String materia, double nota){//constructor de la asignatura
        this.nota = nota;
        this.materia = materia;
    }
    //Agrego getters and setters
    public static double getNota() { //metodo para consultar la nota
        return nota;
    } //consultar la nota
    public static void setNota(double nota) {//metodo para modificar la nota
        Asignatura.nota = nota;
    } //cambiar la nota
    public static String getMateria() {
        return materia;
    }//consultar el nombre de la materia
    String resultado = (nota >= 3.5) ? "Aprobado" : "Reprobado";
}
