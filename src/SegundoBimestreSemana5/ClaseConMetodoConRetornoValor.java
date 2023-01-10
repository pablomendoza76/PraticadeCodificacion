package SegundoBimestreSemana5;

import java.util.Scanner;

public class ClaseConMetodoConRetornoValor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("PROGRAMA PARA SUMAR DOS NUMEROS");
        System.out.println("INGRESE PRIMER NUMERO: ");
        int num1 = teclado.nextInt();
        System.out.println("INGRESE SEGUNDO NUMERO: ");
        int num2 = teclado.nextInt();
        int resultado = sumar(num1,num2); // llamamos el metodo y recibimos el valor
        System.out.println("la suma es : "+resultado );
       // sumar_dos_numeros(num1,num2);
        // obtener el promedio de los numeros ingresados
        double promedio = obtener_promedio(resultado,2);
        System.out.println("EL PROMEDIO DE LOS NUMEROS ES: "+promedio );
    }
    /**
     * Este metodo realiza la suma de dos numeros enteros
     * @param n1
     * @param n2
     * @return
     */
    public static int sumar(int n1, int n2){
         int resultado = n1 + n2;
         return resultado;
    }
    public static void sumar_dos_numeros(int n1, int n2){
        int resultado = n1 + n2;
        System.out.println("La suma de numeros es : "+resultado);
    }

    /**
     * Metodo para obtener el promedio de una suma de val;ores
     * @param suma_total
     * @param catida_num
     * @return
     */
    public static double obtener_promedio(int suma_total, int catida_num){
        double promedio = (double) suma_total/(double) catida_num;
        return promedio;
    }
}
