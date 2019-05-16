public enum Plataforma {
    HBO("HBO España"),
    NETFLIX("Netflix"),
    AMAZON_PRIME_VIDEO("Amazon Prime Video"),
    FILMIN("Filmin"),
    MOVISTAR_PLUS("Movistar+"),
    SKY("Sky");

    private final String nombre;

    Plataforma(String nombre) {
        this.nombre = nombre;
    }
}
