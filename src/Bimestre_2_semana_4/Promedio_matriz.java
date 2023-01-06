package Bimestre_2_semana_4;

/**
 * Programa para calculara el promedio de una matriz con elemnetos dados
 */
public class Promedio_matriz {
    public static void main(String[] args) {
        int numeros[][]={
                {5,6},
                {2,7},
                {7,1},
                {3,4}
        };
        int suma_total = 0;
        for (int fila = 0; fila < numeros.length; fila++) {
            for (int col = 0; col < numeros[0].length; col++) {
                suma_total+= numeros [fila][col];

            }
        }
        int n_elementos = numeros.length*numeros[0].length;
        double promedio = (double) suma_total/n_elementos;
        System.out.println("suma: "+suma_total);
        System.out.println("promedio: "+promedio);
    }
}
