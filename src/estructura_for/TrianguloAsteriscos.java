package estructura_for;

import java.util.Scanner;

public class TrianguloAsteriscos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese nuemro de filas");
        int filas = teclado.nextInt();
        //System.out.println("ingrese nuemero de columnas");
        //int columnas = teclado.nextInt();
        for (int fila = 1; fila <= filas; fila++) {// controlamos numero de filas
            String fila_asteriscos = "";
            for (int col = 1; col <= fila; col++) {//controlamos el numero de columnas
                fila_asteriscos = fila_asteriscos + "*";
            }
            System.out.println( fila_asteriscos);
        }
    }
}