package Semana_4;

import java.util.Scanner;

public class Suma_Matrices {
    public static void main(String[] args) {
        int a[][] = {
                {1, 2, 3},
                {4, 0, 7},
                {1, 6, 5}
        };
        int b[][] = {
                {0, 1, 3},
                {9, 3,2},
                {1, 9, 5}
        };
        int filas = a.length;
        int cols = a[1].length;
        int c[][]= new int[filas][cols];
        //suma de matrizes a+b=c
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
              c[fila][col]=a[fila][col]+b[fila][col];
            }
        }
        //oprecion lectura
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(c[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}