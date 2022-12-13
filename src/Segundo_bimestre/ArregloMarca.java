package Segundo_bimestre;

import java.util.Locale;
import java.util.Scanner;

/**
 * PROGRAMA QUE SOLICITE  EL NOMBRE DE N MARCA DE VEHICULOS Y LAS ALAMCENE EN UN ARREGLO.
 * FINALMENTE EL PROGRAMA DEBE MOSTRAR EL NOMBRE DE LAS MARCAS ALMACENADAS EN EL ARREGLO.
 */

public class ArregloMarca {
    public static void main(String[] args) {
        String marcas[];
        System.out.println("cuantas marcas de vehiculo va a ingresar?");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        teclado.nextLine();
        marcas = new String[n];// creamos el arreglo con n elemnetos
        for (int indice = 0; indice < n; indice++) {
            System.out.println("INGRESE EL NOMBRE DE LA MARCA" + (indice + 1) + ":");
            String marca = teclado.nextLine();
            marcas[indice] = marca.toUpperCase();

        }
        System.out.println("lista de marcas ingresadas");
        for (int indice = 0; indice < marcas.length; indice++) {
            System.out.println(marcas[indice] + "\t");
        }
        //operacion de busqueda
        System.out.println("que marca desea buscar: ");
        //toUppercase
        String marcas_buqueda = teclado.nextLine().toUpperCase();
        System.out.println("marca_busqueda:"+ marcas_buqueda);
        for (int indice = 0; indice < n; indice++) {
            if (marcas_buqueda.equals(marcas[indice]) ){
                System.out.println("Marca encontrada");
                System.out.println("Se encuentra en el indice: "+indice);
                break;
            }
        }
    }
}
