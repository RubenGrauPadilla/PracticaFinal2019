import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Usuario {
    private String nombreUsuario;
    private List<Pelicula> lista=new ArrayList<>();
    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String identificador;
    private final Date fechaIngreso;

    public Usuario(String nombreUsuario, List<Pelicula> lista, String nombre, String apellido1, String apellido2, String identificador, Date fechaIngreso) {
        this.nombreUsuario = nombreUsuario;
        this.lista = lista;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.identificador = identificador;
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public List<Pelicula> getLista() {
        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getIdentificador() {
        return identificador;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }
}
