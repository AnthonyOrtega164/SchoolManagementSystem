import java.util.Date;

public class Estudiante extends Persona{
    private String id;
    private String estado;

    public Estudiante(String nombre, String apellido, Date fechaDeNacimiento, String id, String estado) {
        super(nombre, apellido, fechaDeNacimiento);
        this.id = id;
        this.estado = estado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
