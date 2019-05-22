import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PanelAcceso extends JFrame {
    public static void main(String[] args) throws IOException {
        JFrame panelAcceso = new JFrame();
        JLabel identificador = new JLabel();
        JTextField compruebaIdentificador = new JTextField(10);
        JButton botonRegistro = new JButton();
        JButton botonAcceso = new JButton();


        panelAcceso.add(identificador);
        panelAcceso.add(compruebaIdentificador);
        panelAcceso.add(botonAcceso);
        panelAcceso.add(botonRegistro);





        panelAcceso.setLayout(new GridBagLayout());
        panelAcceso.setBounds(0,0,350,150);
        panelAcceso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panelAcceso.setResizable(false);
        panelAcceso.setLocationRelativeTo(null);
        panelAcceso.setVisible(true);


    }
}
