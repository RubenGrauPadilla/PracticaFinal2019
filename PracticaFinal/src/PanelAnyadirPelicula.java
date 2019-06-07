import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAnyadirPelicula extends JDialog {
    Pelicula p;

    JLabel nombrePelicula = new JLabel("Nombre de la pelicula");
    JTextField nombreIntroducido = new JTextField();
    JLabel duracionPelicula = new JLabel("Duración de la pelicula");
    JTextField duracionIntroducida = new JTextField();
    JLabel valoracionPelicula = new JLabel("Valoración de la pelicula");
    JTextField valoracionIntroducida = new JTextField();
    JLabel plataformaPelicula = new JLabel("Plataformas disponibles");
    JTextField plataformaIntroducida = new JTextField();
    JButton anyadir = new JButton("Añadir a mi lista");

    PanelAnyadirPelicula(){
        setLayout(new GridLayout(5,2));
        add(nombrePelicula);
        add(nombreIntroducido);
        add(duracionPelicula);
        add(duracionIntroducida);
        add(valoracionPelicula);
        add(valoracionIntroducida);
        add(plataformaPelicula);
        add(plataformaIntroducida);
        add(anyadir);
        setBounds(0,0,400,200);
        setResizable(false);
        anyadir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(plataformaIntroducida.equals(null)){
                    PanelPeliculaConPlataforma panelPeliculaConPlataforma = new PanelPeliculaConPlataforma();
                }else{
//                    PanelPelicula panelPelicula = new PanelPelicula();
//                    panelPelicula.setModal(true);
                    JLabel nombre = new JLabel("Nombre: "+nombreIntroducido.getText());
                    JLabel duracion = new JLabel("Duración en horas: "+duracionIntroducida.getText());
                    JLabel valoracion = new JLabel("Valoración: "+valoracionIntroducida.getText());
//                    panelPelicula.add(nombre);
//                    panelPelicula.add(duracion);
//                    panelPelicula.add(valoracion);

                }
                p=new Pelicula(
                  nombreIntroducido.getText(),
                  Double.parseDouble(duracionIntroducida.getText()),
                  Double.parseDouble(valoracionIntroducida.getText()));

                setVisible(false);
            }
        });
    }

    public Pelicula getPelicula() {
        return p;
    }
}
