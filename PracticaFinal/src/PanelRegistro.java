import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PanelRegistro extends JDialog{
    JDialog panelRegistro = new JDialog();
    JLabel nombre = new JLabel("Nombre:");
    JTextField nombreIntroducido = new JTextField(15);
    JLabel apellidos = new JLabel("Apellidos:");
    JTextField apellidosIntroducidos = new JTextField(15);
    JLabel correoElectronico = new JLabel("Correo electrónico:");
    JTextField correoIntroducido = new JTextField(15);
    JLabel fechaNacimiento = new JLabel("Fecha de nacimiento:");
    JTextField fechaNacimientoIntroducida = new JTextField(15);
    JButton registrarse = new JButton("Registrarse");

    PanelRegistro() {
        add(nombre);
        add(nombreIntroducido);
        add(apellidos);
        add(apellidosIntroducidos);
        add(correoElectronico);
        add(correoIntroducido);
        add(fechaNacimiento);
        add(fechaNacimientoIntroducida);
        add(registrarse);

        setBounds(0, 0, 200, 260);
        setLayout(new FlowLayout());
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        registrarse.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarUsuario();
                panelRegistro.dispose();
            }
        });
    }

    private void guardarUsuario() {
        String[] usuario = new String[4];
        usuario[0]=nombreIntroducido.getText();
        usuario[1]=apellidosIntroducidos.getText();
        usuario[2]=correoIntroducido.getText();
        usuario[3]=fechaNacimientoIntroducida.getText();
        File usuarios = new File("Usuario");
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(usuarios.getAbsoluteFile(),true))){
            if(!usuarios.exists()){
                usuarios.createNewFile();
            }
            for (int i = 0; i < 4; i++) {
                bw.write(usuario[i]+"\n");
            }
            panelRegistro.setVisible(false);
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }

}
