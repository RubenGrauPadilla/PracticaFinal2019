import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelAcceso extends JFrame{
    PanelAcceso(){
        setLayout(new FlowLayout());
        JLabel identificador = new JLabel("Introduzca su nº de identificación");
        JTextField compruebaIdentificador = new JTextField(15);
        JButton botonAcceso = new JButton("Iniciar sesión");
        JButton botonRegistro = new JButton("¿No tiene cuenta?Cree una aquí");

        add(identificador);
        add(compruebaIdentificador);
        add(botonAcceso);
        add(botonRegistro);


        botonAcceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                InterfazUsuario interfazUsuario = new InterfazUsuario();
            }
        });




        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                PanelRegistro panelRegistro = new PanelRegistro();
            }
        });




        setBounds(0,0,250,155);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
