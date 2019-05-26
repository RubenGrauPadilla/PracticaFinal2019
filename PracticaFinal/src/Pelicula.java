class Pelicula {
    private final String nombre;
    private final double duracion;
    private double valoracion;

    public Pelicula(String nombre, double duracion, double valoracion) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.valoracion = valoracion;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}

class PeliculaEstrenadaCine extends Pelicula {
    private final int taquilla1erFinDeSemana;
    public PeliculaEstrenadaCine(String nombre, double duracion, double valoracion, int taquilla1erFinDeSemana) {
        super(nombre, duracion, valoracion);
        this.taquilla1erFinDeSemana = taquilla1erFinDeSemana;
    }

    public int getTaquilla1erFinDeSemana() {
        return taquilla1erFinDeSemana;
    }
}



class PeliculaPlataformasOnline extends Pelicula {
    Plataforma plataforma;
    public PeliculaPlataformasOnline(String nombre, double duracion, double valoracion, Plataforma plataforma) {
        super(nombre, duracion, valoracion);
        this.plataforma = plataforma;
    }

    public String getPlataforma() {
        return plataforma.getNombre();
    }

}