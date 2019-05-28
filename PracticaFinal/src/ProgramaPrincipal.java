import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class ProgramaPrincipal extends JFrame{
    public static void main(String[] args) {
        Map<String, String> accesoAplicacion = new TreeMap<>();

        JFrame panelAcceso = new JFrame();
        panelAcceso.setLayout(new FlowLayout());
        JLabel identificador = new JLabel("Introduzca su nº de identificación");
        JTextField compruebaIdentificador = new JTextField(15);
        JButton botonAcceso = new JButton("Iniciar sesión");
        JButton botonRegistro = new JButton("¿No tiene cuenta?Cree una aquí");

        panelAcceso.add(identificador);
        panelAcceso.add(compruebaIdentificador);
        panelAcceso.add(botonAcceso);
        panelAcceso.add(botonRegistro);
//Botón crear cuenta
        botonRegistro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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

                panelRegistro.add(nombre);
                panelRegistro.add(nombreIntroducido);
                panelRegistro.add(apellidos);
                panelRegistro.add(apellidosIntroducidos);
                panelRegistro.add(correoElectronico);
                panelRegistro.add(correoIntroducido);
                panelRegistro.add(fechaNacimiento);
                panelRegistro.add(fechaNacimientoIntroducida);
                panelRegistro.add(registrarse);
//Botón registrarse
                registrarse.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
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
                            String identificacion=crearIdentificador();
                            accesoAplicacion.put(identificacion,correoIntroducido.getText());
                            panelRegistro.setVisible(false);
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                });

                panelRegistro.setBounds(0,0,200,260);
                panelRegistro.setLayout(new FlowLayout());
                panelRegistro.setVisible(true);
                panelRegistro.setResizable(false);
                panelRegistro.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                panelRegistro.setLocationRelativeTo(null);
            }
        });
//Botón para acceder
        botonAcceso.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JPanel interfazUsuario = new JPanel();
                JDialog lista = new JDialog();
                JButton anyadirCancion = new JButton();
                JButton eliminarCancion = new JButton();


                anyadirCancion.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
                eliminarCancion.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                    }
                });
            }
        });


        panelAcceso.setBounds(0,0,250,155);
        panelAcceso.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        panelAcceso.setResizable(false);
        panelAcceso.setLocationRelativeTo(null);
        panelAcceso.setVisible(true);

    }


    public static String crearIdentificador(){
        int numeroIdentificador1 = 0;
        int numeroIdentificador2 = 0;
        String identificador = "";
        while(numeroIdentificador1<10000 && numeroIdentificador2<10000){
            numeroIdentificador2 = (int) Math.floor(Math.random()*99999+1);
            numeroIdentificador1 = (int) Math.floor(Math.random()*99999+1);
            identificador = numeroIdentificador1 + "" + numeroIdentificador2;
        }
        return identificador;
    }
}
