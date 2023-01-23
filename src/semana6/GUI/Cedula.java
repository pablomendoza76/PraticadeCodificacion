package SegundoBimestre.semana6.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cedula {
    private JPanel panelPrincipal;
    private JTextField txt_cedula;
    private JButton VALIDARButton;

    public Cedula() {
        VALIDARButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_cedula.getText().length() == 10) {
                    int cedula[] = new int[10];
                    String ced = txt_cedula.getText();
                    System.out.println(ced);
                    for (int indice = 0; indice < cedula.length; indice++) {
                        cedula[indice] = Character.getNumericValue(ced.charAt(indice));
                        System.out.println(cedula[indice] + " ");
                    }
                    Cedula asd = new Cedula();
                    for (int indice = 0; indice < 9; indice = indice + 2) {
                        cedula[indice] = cedula[indice] * 2;
                    }
                    for (int indice = 0; indice < 9; indice++) {
                        if (cedula[indice] >= 10) {
                            cedula[indice] = cedula[indice] - 9;
                        }
                    }
                    int acumulador = 0;
                    for (int indice = 0; indice < 9; indice++) {
                        acumulador = cedula[indice] + acumulador;
                    }
                    int decena = 0;
                    while (acumulador < 99 || acumulador < 1000) {
                        decena = acumulador / 10;
                        break;
                    }
                    System.out.println(decena);
                    decena = (decena * 10) + 10;
                    System.out.println(decena);
                    int resultadoresta = 0;
                    resultadoresta = decena - acumulador;

                    if (resultadoresta == cedula[9]) {
                        String mensaje1 = "Cedula Valida";
                        VALIDARButton.setText(mensaje1);
                    } else {
                        String mensaje2 = "Cedula invalidad";
                        VALIDARButton.setText(mensaje2);
                    }
                } else {
                    String mensaje4 = "Cedula Incorrecta";
                    VALIDARButton.setText(mensaje4);
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame inicio = new JFrame("Validacion");
        inicio.setContentPane(new Cedula().panelPrincipal);
        inicio.pack();
        inicio.setVisible(true);
    }
}