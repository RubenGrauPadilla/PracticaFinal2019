import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Pelicula {
    private final Genero genero;
    private final String titulo;
    private final int duracion;
    private double valoracion;
    private int ventas;
    private final String sinopsis;
    List<Actores> lista;

    public Genero getGenero() {
        return genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
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

    public int getVentas() {
        return ventas;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public Pelicula(Genero genero, String titulo, int duracion, double valoracion, int ventas, String sinopsis) {
        this.genero = genero;
        this.titulo = titulo;
        this.duracion = duracion;
        this.valoracion = valoracion;
        this.ventas = ventas;
        this.sinopsis = sinopsis;
        this.lista = new ArrayList<>();
    }

    public String infoPelicula(){
        return "La pelicula " + this.titulo +
                " pertenece al genero:" + this.genero.getNombre() +",\n"+
                "tiene una duracion de " + this.duracion%60 +" horas"+
                " y cuenta con la participación de actores como: "+this.lista +
                ".";
    }

    public String infoExtraPelicula(){
        return "La pelicula "+this.titulo+" ha tenido un total de "+this.ventas+" ventas y\n"+
                "ha obtenido una valoración de "+this.valoracion+" estrellas.";
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero=" + this.genero.getNombre() +
                ", titulo='" + this.titulo + '\'' +
                ", duracion=" + this.duracion +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pelicula pelicula = (Pelicula) o;
        return Objects.equals(titulo, pelicula.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo);
    }
}
