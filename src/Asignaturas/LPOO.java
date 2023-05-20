package Asignaturas;

public class LPOO extends Asignatura {
    public void nombre(){
        System.out.println("LPOO");
    }
    private static double nota;
    public LPOO(double nota){//constructor de la nota
        this.nota = nota;
    }
    public static double getNota() { //metodo para consultar la nota
        return nota;
    }

    public static void setNota(double nota) {//metodo para modificar la nota
        LPOO.nota = nota;
    }
    String resultado = (nota >= 3.5) ? "Aprobado" : "Reprobado";
}
