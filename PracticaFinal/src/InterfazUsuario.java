import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterfazUsuario extends JDialog{
    JDialog interfazUsuario;
    JPanel lista = new JPanel();
    JButton anyadirPelicula = new JButton();

    InterfazUsuario() {
        interfazUsuario=this;
        setLayout(new BorderLayout());
        add(lista);
        add(anyadirPelicula, BorderLayout.);
        setBounds(0,0,500,500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        anyadirPelicula.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelPelicula panelPelicula = new PanelPelicula();
            }
        });
    }
}
