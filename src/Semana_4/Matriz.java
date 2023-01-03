package Semana_4;

public class Matriz {
    public static void main(String[] args) {
       // int matriz[][] = new int[2][3];
        //System.out.println(matriz[1][2]);
        //creacion de una matriz con valores predeterminados
        String univ[][]={
                {"utpl","ucuneca","espol"},
                {"unl","uazuay","uide"}
        };
       // System.out.print("dimension matriz: ");
       // System.out.print("fila = "+ univ.length);
        //System.out.print(", columnas = "+ univ[1].length);
        int filas = univ.length;
        int columnas = univ[1].length;
        for (int fila = 0; fila < filas; fila++) {
            for (int col = 0; col < columnas; col++) {
                System.out.print(univ[fila][col] + "\t");
            }
            System.out.println();
        }
    }
}
