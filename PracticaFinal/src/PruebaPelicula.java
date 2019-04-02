import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaPelicula {
    public static void main(String[] args) {

        Pelicula pelicula1=new Pelicula(Genero.DRAMA,"Titanic",130,4.0,123345,"Un barquito " +
                "que se hunde al chocarse con un iceberg");

        JFrame uno= new JFrame();

        JPanel cartelera=new JPanel();
        JButton peli1=new JButton(pelicula1.getTitulo());
        peli1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,pelicula1.infoPelicula());
            }
        });
        cartelera.add(peli1);













        uno.add(cartelera);
        uno.setBounds(20,20,310,260);
        uno.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        uno.setLocationRelativeTo(null);
        uno.setVisible(true);
    }
}


