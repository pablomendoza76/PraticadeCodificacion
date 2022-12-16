package Segundo_Bimestre_Semana2;

import java.util.Scanner;

public class Suma_arreglos {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        System.out.println("INGRESAR EL LIMITE DE LOS ARREGLOS ");
        int arreglo= teclado.nextInt();
        int arreglo1[]=new int[arreglo];
        int arreglo2[]=new int[arreglo];
        System.out.println("Arreglo 1");
        for (int indice = 0; indice < arreglo; indice++) {
            System.out.println("ingrese numeros"+ (indice+1));
            int numero= teclado.nextInt();
            arreglo1[indice]=numero;
        }
        System.out.println("Arreglo 2");
        for (int indice = 0; indice < arreglo2.length; indice++) {
            System.out.println("Ingrese los nunmeros"+(indice+1));
            int numero1= teclado.nextInt();
            arreglo2[indice]=numero1;
        }
        int valores[]=new int[arreglo];
        for (int indice = 0; indice < arreglo; indice++) {
            valores[indice]=arreglo1[indice]+arreglo2[indice];
        }
        System.out.println("arreglo final");
        for (int indice = 0; indice < arreglo; indice++) {
            System.out.println(valores[indice]);
        }
    }
}
