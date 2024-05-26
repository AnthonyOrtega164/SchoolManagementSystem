import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("A", "B", new Date(1996, 12, 22), "1", "inactivo");
        Estudiante estudiante2 = new Estudiante("A1", "B", new Date(1998, 1, 20), "2", "inactivo");
        Estudiante estudiante3 = new Estudiante("A2", "B", new Date(1999, 2, 2), "3", "inactivo");
        Estudiante estudiante4 = new Estudiante("A3", "B", new Date(1996, 3, 28), "4", "inactivo");
        Estudiante estudiante5 = new Estudiante("A4", "B", new Date(1997, 4, 29), "5", "inactivo");
        Estudiante estudiante6 = new Estudiante("A5", "B", new Date(1995, 5, 27), "6", "inactivo");
        Curso curso = new Curso("1","lengua","lengua y literatura",25,2);
        GestorAcademico gestorAcademico = new GestorAcademico();
        gestorAcademico.agregarCurso(curso);
        gestorAcademico.matricularEstudiante(estudiante1);
        gestorAcademico.matricularEstudiante(estudiante2);
        gestorAcademico.matricularEstudiante(estudiante3);
        gestorAcademico.matricularEstudiante(estudiante4);
        gestorAcademico.matricularEstudiante(estudiante5);
        gestorAcademico.matricularEstudiante(estudiante6);
        gestorAcademico.inscribirEstudianteCurso(estudiante1,"1");
        gestorAcademico.inscribirEstudianteCurso(estudiante2,"1");
        gestorAcademico.inscribirEstudianteCurso(estudiante3,"1");
        gestorAcademico.inscribirEstudianteCurso(estudiante4,"1");
        gestorAcademico.inscribirEstudianteCurso(estudiante5,"1");
        gestorAcademico.inscribirEstudianteCurso(estudiante6,"1");
        gestorAcademico.desinscribirEstudianteCurso("1","1");
        gestorAcademico.desinscribirEstudianteCurso("2","1");
        gestorAcademico.desinscribirEstudianteCurso("3","1");
        gestorAcademico.desinscribirEstudianteCurso("4","1");
        gestorAcademico.desinscribirEstudianteCurso("5","1");
        gestorAcademico.desinscribirEstudianteCurso("6","1");
    }
}