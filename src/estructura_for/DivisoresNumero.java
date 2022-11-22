package estructura_for;

import java.util.Scanner;

public class DivisoresNumero {
    public static void main(String[] args) {
        System.out.println("ingrese numero");
        Scanner teclado = new Scanner(System.in);
        int numero = teclado.nextInt();
        for (int contador=1; contador<=numero; contador++){
            if (numero%contador==0)
                System.out.println("los divisores son "+contador);
        }

    }
}
