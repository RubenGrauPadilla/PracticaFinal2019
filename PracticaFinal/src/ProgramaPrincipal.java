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

        PanelAcceso panelAcceso = new PanelAcceso();


//Botón para acceder
//        botonAcceso.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//
//                JPanel interfazUsuario = new JPanel();
//                JDialog lista = new JDialog();
//                JButton anyadirCancion = new JButton();
//                JButton eliminarCancion = new JButton();
//
//
//                anyadirCancion.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//                eliminarCancion.addActionListener(new ActionListener() {
//                    @Override
//                    public void actionPerformed(ActionEvent e) {
//
//                    }
//                });
//            }
//        });
    }
}
