import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import java.util.TreeMap;

public class PanelAcceso extends JFrame{
    Map<String,String> accesoAplicacion = new TreeMap<>();
    PanelAcceso(){
        setLayout(new GridLayout(2,2));
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


        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public void anyadirUsuarioMapa(String identificador,String nombre){
        accesoAplicacion.put(identificador, nombre);
    }
}
