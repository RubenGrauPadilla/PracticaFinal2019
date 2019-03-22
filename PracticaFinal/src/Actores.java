public class Actores {
    String nombre;
    int edad;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Actores(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String info(){
        return "Nombre: "+this.nombre+" edad: "+this.edad;
    }

    @Override
    public String toString() {
        return "Actores{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
