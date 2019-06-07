import javax.swing.*;
import java.awt.*;

public class PanelPelicula extends JDialog {

    PanelPelicula(){
        setLayout(new GridLayout(4,0));
        setVisible(true);
        setResizable(false);
        setBounds(0,0,200,100);
    }


    public String getPelicula(Pelicula p){
        return p.getNombre();
    }
}

class PanelPeliculaConPlataforma extends JDialog {
    JLabel nombre = new JLabel("Nombre:");
    JLabel duracion = new JLabel("Duración:");
    JLabel valoracion = new JLabel("Valoración:");
    JLabel plataforma = new JLabel("Plataformas disponibles:");

    PanelPeliculaConPlataforma(){
        setLayout(new GridLayout(4,0));
        add(nombre);
        add(duracion);
        add(valoracion);
        add(plataforma);
        setVisible(true);
        setResizable(false);
        pack();
    }
}