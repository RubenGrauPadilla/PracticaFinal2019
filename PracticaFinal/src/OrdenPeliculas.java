import java.util.Comparator;

public enum OrdenPeliculas {
    POR_NOMBRE((o1, o2) -> {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }),
    POR_DURACION((o1, o2) -> {
        return o1.getDuracion()-o2.getDuracion();
    }),
//    POR_VALORACION(),
    POR_VENTAS((o1, o2) -> {
        return o1.getVentas()-o2.getVentas();
    });
    private final Comparator<Pelicula> comparador;

    OrdenPeliculas(Comparator<Pelicula> comparador) {
        this.comparador = comparador;
    }
}
