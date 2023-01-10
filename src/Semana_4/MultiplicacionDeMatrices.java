package semanacuatro;

import java.util.Scanner;

public class MultiplicacionDeMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese las filas de las matrizes");
        int f = sc.nextInt();
        System.out.println("Ingrese las columnas de las matrizes");
        int c = sc.nextInt();
        int matriza [][]= new int[f][c];
        int matrizb[][]= new int[f][c];
        int matrizc[][]=new int[matriza.length][matrizb[0].length];
        System.out.println("Ingrese los datos de la primera matriz");
        for (int indice1 = 0; indice1 < matriza.length; indice1++) {
            for (int indice2 = 0; indice2 < matriza[0].length; indice2++) {
                matriza[indice1][indice2]= sc.nextInt();
            }
        }
        System.out.println("Ingrese los datos de la segunda matriz");
        for (int indice1 = 0; indice1 < matrizb.length; indice1++) {
            for (int indice2 = 0; indice2 < matrizb[0].length; indice2++) {
                matrizb[indice1][indice2]= sc.nextInt();
            }
        }
        System.out.println("Matriz a");
        for (int indice = 0; indice < matriza.length; indice++) {
            for (int indice2 = 0; indice2 < matriza[0].length; indice2++) {
                System.out.print(matrizb[indice][indice2]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("Matriz b");
        System.out.println("\t");
        for (int indice = 0; indice < matrizb.length; indice++) {
            for (int indice2 = 0; indice2 < matrizb[0].length; indice2++) {
                System.out.print(matrizb[indice][indice2]+"\t");
            }
            System.out.println("\n");
        }
        for (int fila = 0; fila < matriza.length; fila++) {
            for (int columna = 0; columna < matrizb[0].length; columna++) {
                for (int x = 0; x < matriza[0].length; x++) {
                    matrizc[fila][columna] =matrizc[fila][columna]+(matriza[fila][x] * matrizb[x][columna]);
                }
            }
        }
        System.out.println("\t");
        System.out.println("Matriz c");
        for (int indice = 0; indice < matrizc.length; indice++) {
            for (int indice2 = 0; indice2 < matrizc[0].length; indice2++) {
                System.out.print(matrizc[indice][indice2]+"\t");
            }
            System.out.println("\n");
        }
    }
}