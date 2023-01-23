package SegundoBimestre.semana6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumaNumero {
    private JPanel panelPrincipal;
    private JTextField txt_n1;
    private JTextField txt_n2;
    private JButton btn_suma;
    private JLabel lbl_resultado;
    private JButton restarButton;
    private JButton multiplicarButton;
    private JButton dividirButton;

    public SumaNumero() {
        btn_suma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int suma = Integer.parseInt(txt_n1.getText())
                        + Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText( String.valueOf(suma));
            }
        });
        restarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resta = Integer.parseInt(txt_n1.getText())
                        - Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText( String.valueOf(resta));
            }
        });

        multiplicarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int mult = Integer.parseInt(txt_n1.getText())
                        * Integer.parseInt(txt_n2.getText());
                lbl_resultado.setText( String.valueOf(mult));
            }
        });

        dividirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double division = Double.parseDouble(txt_n1.getText())
                        / Double.parseDouble(txt_n2.getText());
                lbl_resultado.setText( String.valueOf(division));
            }
        });
    }




    public static void main(String[] args) {
        JFrame inicio = new JFrame("SumaNumero");
        inicio.setContentPane(new SumaNumero().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}
