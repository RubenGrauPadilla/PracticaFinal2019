import javax.swing.*;

public class PruebaPelicula {
    public static void main(String[] args) {

        Pelicula pelicula1=new Pelicula(Genero.DRAMA,"Titanic",2.1,4.0);

        JFrame uno= new JFrame();

        JPanel cartelera=new JPanel();
        JButton peli1=new JButton(pelicula1.getTitulo());
        cartelera.add(peli1);













        uno.add(cartelera);
        uno.setBounds(20,20,310,260);
        uno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        uno.setLocationRelativeTo(null);
        uno.setVisible(true);
    }
}


