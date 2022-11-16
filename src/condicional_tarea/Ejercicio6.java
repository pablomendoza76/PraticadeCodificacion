package condicional_tarea;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese tiempo: ");
        int tiempo = teclado.nextInt();
        int dias=0;
        int horas=0;
        int minutos=0;
        while (tiempo>0){
         if (tiempo>=1148){
             dias=dias+1;
             tiempo=tiempo-1140;
         }else if (tiempo>=60) {
             horas=horas+1;
             tiempo=tiempo-60;
         }else {
             minutos=minutos+1;
             tiempo=tiempo-1;
         }
        }
        System.out.println("Dias: " +dias);
        System.out.println("Horas: " +horas);
        System.out.println("Minutos: " +minutos);
    }
}
