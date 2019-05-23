import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProgramaPrincipal extends JFrame{
    public static void main(String[] args) {

        JFrame panelAcceso = new JFrame();
        panelAcceso.setLayout(new FlowLayout());
        JLabel identificador = new JLabel("Introduzca su nº de identificación");
        JTextField compruebaIdentificador = new JTextField(15);
        JButton botonRegistro = new JButton("¿No tiene cuenta?Cree una aquí");
        JButton botonAcceso = new JButton("¿Ya tiene un cuenta?Inice sesión aquí");

        panelAcceso.add(identificador);
        panelAcceso.add(compruebaIdentificador);
        panelAcceso.add(botonRegistro);
        panelAcceso.add(botonAcceso);

        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog panelRegistro = new JDialog();
                JLabel nombre = new JLabel("Nombre:");
                JTextField nombreIntroducido = new JTextField(20);
                JLabel apellidos = new JLabel("Apellidos:");
                JTextField apellidosIntroducidos = new JTextField(20);
                JLabel correoElectronico = new JLabel("Correo electrónico:");
                JTextField correoIntroducido = new JTextField(20);
                JLabel fechaNacimiento = new JLabel("Fecha de nacimiento:");
                JTextField fechaNacimientoIntroducida = new JTextField(20);

                panelRegistro.add(nombre);
                panelRegistro.add(nombreIntroducido);
                panelRegistro.add(apellidos);
                panelRegistro.add(apellidosIntroducidos);
                panelRegistro.add(correoElectronico);
                panelRegistro.add(correoIntroducido);
                panelRegistro.add(fechaNacimiento);
                panelRegistro.add(fechaNacimientoIntroducida);
            }
        });


        panelAcceso.setBounds(0,0,250,155);
        panelAcceso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panelAcceso.setResizable(false);
        panelAcceso.setLocationRelativeTo(null);
        panelAcceso.setVisible(true);

    }
}
