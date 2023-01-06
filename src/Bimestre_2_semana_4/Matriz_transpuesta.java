package Bimestre_2_semana_4;

public class Matriz_transpuesta {
    public static void main(String[] args) {
        char letras[][]={
                {'a','b','c'},
                {'d','e','f'}
        };//dimension 2x3
        int filas= letras.length;
        int columnas= letras[0].length;
        char transpuesta[][]= new char[columnas][filas];
        for (int fila = 0; fila < columnas; fila++) {
            for (int col = 0; col < filas; col++) {
                transpuesta[fila][col] = letras[col][fila];
                System.out.print(letras[col][fila] + "\t");
            }
            System.out.println();
        }
    }
}
