package Bimestre2semana3;

import java.util.Scanner;

public class FichaDatos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombres[] = new String[100];
        int EDAD[] = new int[100];
        String uni[] = new String[100];
        boolean interruptor = true;
        int indice = 0;
        while (interruptor) {
            System.out.println("ingresar datos del estudiante");
            System.out.println("ingrese nombre");
            nombres[indice] = teclado.nextLine();
            System.out.println("ingrese edad");
            EDAD[indice] = teclado.nextInt();
            teclado.nextLine();//PARA LEER EL ENTER LUEGO DE INGRESAR EDAD
            System.out.println("ingrese universidad");
            uni[indice] = teclado.nextLine();
            indice++;
            System.out.println("Desea ingresar un nuevo estudiante si/no");
            String resp = teclado.nextLine().toLowerCase();
            if (resp.equals("no"))
                interruptor = false;
        }
        //ORDENAR ARREGLO POR EDAD
        System.out.println("ORDENAR ARRGLO POR EDAD");
        for (int ind = 1; ind <= EDAD.length - 1; ind++) {
            for (int elemento = 0; elemento <= EDAD.length - 2; elemento++) {
                //VERIFICAR SI REALIZAMOS EL INTERCAMBIO
                if (EDAD[elemento] > EDAD[elemento + 1]) {
                    int aux = EDAD[elemento];
                    EDAD[elemento] = EDAD[elemento + 1];
                    EDAD[elemento + 1] = aux;
                    //proceso de intercambio rn arrglo nombres
                    String aux_n = nombres[elemento];
                    nombres[elemento] = nombres[elemento + 1];
                    nombres[elemento + 1] = aux_n;
                    String aux_u = uni[elemento];
                    uni[elemento] = uni[elemento + 1];
                    uni[elemento + 1] = aux_u;
                }
            }
        }
        //presentar datos de los estudiantes
        for (int indi = 0; indi < nombres.length; indi++) {
            if (nombres[indi] != null) {
                System.out.println("Nombres: " + nombres[indi]);
                System.out.println("Edad: " + EDAD[indi]);
                System.out.println("Universidad: " + uni[indi]);
            }
        }
    }
}
