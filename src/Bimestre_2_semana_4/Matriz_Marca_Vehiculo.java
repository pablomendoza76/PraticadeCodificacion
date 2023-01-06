package Bimestre_2_semana_4;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

/**
 * Progrma para crear una matriz con valores recibidos desde el teclado, y luego poder realizar repetitivamente opreciones de:
 * 1.Buaqueda
 * 2.Modificaciion
 * 3.Eliminacion
 * 4.Visualizacion
 * 5.Salida
 */
public class Matriz_Marca_Vehiculo {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("ingrese numero de filas");
        int filas = teclado.nextInt();
        System.out.println("ingrese numero de columnas");
        int columnas = teclado.nextInt();
        teclado.nextLine();
        String marcas [][]= new String[filas][columnas];// establecemos dimencion
        for (int fila1 = 0; fila1 < filas; fila1++) {
            for (int col1 = 0; col1 < columnas; col1++) {
                System.out.println("ingrese marca: ["+fila1+"]["+col1+"]");
                marcas[fila1][col1]= teclado.nextLine().toLowerCase();
            }

        }
        boolean salir = false;
        while (!salir){
            System.out.println("Menu de opciones");
            System.out.println("Digitar 1 para buscar: ");
            System.out.println("digitar 2 para modificar un valor: ");
            System.out.println("digitar 3 para eliminar un valor: ");
            System.out.println("digitar 4 para vizualizar la matriz: ");
            System.out.println("digitar 5 para salir: ");
            int opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    teclado.nextLine();
                    System.out.println("Has seleccionado la opcion busqueda");
                    System.out.println("Que marca busca?");
                    String marca_busca= teclado.nextLine().toLowerCase();
                    boolean encontrado = false;
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < columnas; col++) {
                           if ( marcas[fila][col].equals(marca_busca)){
                               System.out.println("si se encontro la maraca: " + marca_busca);
                               System.out.println("esta en la posicion: ["+fila+"]["+col+"]");
                               encontrado=true;
                               break;
                           }
                        }
                    }
                    if (encontrado==false)
                        System.out.println("marca no hallada");
                    break;
                case 2:
                    System.out.println("Has seleccionado la operacion modificacion");
                    System.out.println("ingrese fila a modificar");
                    int fila2 = teclado.nextInt();
                    System.out.println("ingrese columna a modificar");
                    int columna = teclado.nextInt();
                    System.out.println("ingresar nueva marca");
                    teclado.nextLine();
                    String nueva = teclado.nextLine();
                    marcas[fila2][columna]= nueva;
                    break;
                case 3:
                    System.out.println("Has seleccionado la opcion eliminacion");
                    System.out.println("marca a eliminar");
                    String marca_borrar= teclado.nextLine().toLowerCase();
                    teclado.nextLine();
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < columnas; col++) {
                            if (marcas[fila][col].equals(marca_borrar)){
                                marcas[fila][col] = "";
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("has seleccionado la operacion lectura");
                    for (int fila = 0; fila < filas; fila++) {
                        for (int col = 0; col < columnas; col++) {
                            System.out.print(marcas[fila][col]+"\t");
                        }
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("hasta luego vuelva pronto");
                    salir = true;
                    break;
                default:
                    System.out.println("Seleccion invalida");
            }
        }
    }
}
