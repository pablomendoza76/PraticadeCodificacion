package Bimestre_2_semana_4;

import java.util.Scanner;

public class Potencia_matriz {
    public static void main(String[] args) {
        int numeros[][]={
                {1,2,3},
                {4,5,6,},
                {7,8,9}
        };//dimension de la matriz 3x3
        int filas = numeros.length;
        int columna = numeros[0].length;
        int mat_potencia[][]= new int[filas][columna];
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese el valor de la potencia: ");
        int potencia = teclado.nextInt();
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
               mat_potencia[fila][col] = (int) Math.pow(numeros[fila][col],potencia);
                System.out.print( mat_potencia[fila][col] + "\t");
            }
            System.out.print("\n");
        }
    }
}
