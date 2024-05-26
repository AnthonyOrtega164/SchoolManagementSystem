import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Estudiante, Curso> estudianteCursos;

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public HashMap<Estudiante, Curso> getEstudianteCursos() {
        return estudianteCursos;
    }

    public void setEstudianteCursos(HashMap<Estudiante, Curso> estudianteCursos) {
        this.estudianteCursos = estudianteCursos;
    }
}
