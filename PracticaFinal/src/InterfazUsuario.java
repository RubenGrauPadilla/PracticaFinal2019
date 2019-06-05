import javax.swing.*;
import java.awt.*;

public class InterfazUsuario extends JDialog{
    JDialog interfazUsuario = new JDialog();
    JPanel lista = new JPanel();
    JButton anyadirPelicula = new JButton();

    InterfazUsuario() {
        setLayout(new BorderLayout());
        add(interfazUsuario);
        add(lista);
        add(anyadirPelicula);
        setBounds(0,0,500,500);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    }
}
