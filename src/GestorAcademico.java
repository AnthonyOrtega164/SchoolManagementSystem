import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GestorAcademico implements ServiciosAcademicosI {
    public static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    public static ArrayList<Curso> cursos = new ArrayList<>();
    public static HashMap<Estudiante, Curso> estudianteCursos = new HashMap<>();

    @Override
    public void matricularEstudiante(Estudiante estudiante) {
        estudiante.setEstado("Matriculado");
        estudiantes.add(estudiante);
        System.out.println("Se agrego estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido()+" estatus: " + estudiante.getEstado());
    }

    @Override
    public void agregarCurso(Curso curso) {
        cursos.add(curso);
        System.out.println("Se agrego curso: " + curso.getNombre());
    }

    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, String idCurso) {
        for (Curso curso : cursos) {
            if (curso.getId().equals(idCurso)) {
                estudianteCursos.put(estudiante, curso);
                System.out.println("Se inscribio a estudiante: " + estudiante.getNombre() + " " + estudiante.getApellido());
            }
        }
    }

    @Override
    public void desinscribirEstudianteCurso(String idEstudiante, String idCurso) {
        Iterator<Map.Entry<Estudiante, Curso>> iterator = estudianteCursos.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Estudiante, Curso> entry = iterator.next();
            if (entry.getKey().getId().equals(idEstudiante) && entry.getValue().getId().equals(idCurso)) {
                iterator.remove();
                System.out.println("Se desinscribio a estudiante: " + idEstudiante);
            }
        }

    }
}
