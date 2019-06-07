import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JDialog{
    JDialog interfazUsuario;
    JPanel lista = new JPanel();
    JButton anyadirPelicula = new JButton("Añadir pelicula");

    InterfazUsuario() {
        interfazUsuario=this;
        setLayout(new BorderLayout());
        add(lista,BorderLayout.CENTER);
        add(anyadirPelicula, BorderLayout.SOUTH);
        setBounds(0,0,500,400);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        anyadirPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                PanelAnyadirPelicula panelAnyadirPelicula = new PanelAnyadirPelicula();
                panelAnyadirPelicula.setModal(true);
                panelAnyadirPelicula.setVisible(true);
                Pelicula p=panelAnyadirPelicula.getPelicula();
                //En p está la pellícula nueva

            }
        });
    }
}
