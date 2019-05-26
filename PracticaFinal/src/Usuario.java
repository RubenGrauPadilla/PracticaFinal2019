import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Usuario {
    private String nombreUsuario;
    private List<Pelicula> listaPeliculas;
    private final String nombre;
    private final String apellidos;
    private final String identificador;
    private final Date fechaIngreso;

    public Usuario(String nombreUsuario, String nombre, String apellidos, String identificador, Date fechaIngreso) {
        this.nombreUsuario = nombreUsuario;
        this.listaPeliculas = new ArrayList<>();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.identificador = identificador;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public List<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
