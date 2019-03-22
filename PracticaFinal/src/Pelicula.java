import java.util.ArrayList;
import java.util.List;

public class Pelicula {
    private final Genero genero;
    private final String titulo;
    private final double duracion;
    double valoracion;
    List<Actores> lista;

    public Genero getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public List<Actores> getLista() {
        return lista;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public void setLista(List<Actores> lista) {
        this.lista = lista;
    }

    public Pelicula(Genero genero, String titulo, double duracion, double valoracion) {
        this.genero = genero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.valoracion = valoracion;
        this.lista=new ArrayList<>();
    }

    public String infoPelicula(){
        return "La pelicula " + this.titulo +
                "pertenece al/los genero(s)=" + this.genero +",\n"+
                "tiene una duracion de " + duracion +" horas"+
                " y cuenta con la participación de actores como: "+this.lista +
                ".";
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero=" + genero +
                ", titulo='" + titulo + '\'' +
                ", duracion=" + duracion +
                '}';
    }
}
