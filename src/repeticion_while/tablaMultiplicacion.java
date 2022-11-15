package repeticion_while;


import javax.swing.JOptionPane;

import static javax.swing.JOptionPane.*;

/**
 * Generar la tabla de multiplicar hasta el 10 de un numero ingresado por teclado
 */
public class tablaMultiplicacion {
    public static void main(String[] args) {
        //System.out.println("PROGRAMA PARA GENERAR LA TABLA DE MULTUPLICAR");
        showMessageDialog(null,"PROGRAMA PARA GENERAR LA TABLA DE MULTUPLICAR");
        //System.out.println("ingrese un numero");
        String num = showInputDialog("ingrese un numero: ");
        int contador = 1;
        String acumulador = "";
        while (contador <= 10 ){
            int mult = Integer.parseInt(num) * contador;//convertimos valor string a int
            String salida = num + "x" + String.valueOf(contador) +"=" +  String.valueOf(mult)+"\n";
            acumulador = acumulador + salida;
            contador = contador +1;
        }
        JOptionPane.showMessageDialog(null, acumulador);


    }
}
