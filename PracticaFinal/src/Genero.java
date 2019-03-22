public enum Genero {
    DRAMA("Drama"),
    CIENCIA_FICCION("Ciencia ficción"),
    TERROR("Terror"),
    COMEDIA("Comedia"),
    ACCION("Acción"),
    AVENTURA("Aventuras"),
    INTRIGA("Intriga"),
    ANIMACION("Animación"),
    ROMANCE("Romance"),
    BELICO("Bélico"),
    MUSICAL("Musical"),
    HISTORICO("Histórico"),
    WESTERN("Del viejo oeste");
    private final String nombre;

    Genero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
