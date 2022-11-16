package condicional_tarea;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el dia: ");
        int dia = teclado.nextInt();
        System.out.println("Ingrese el mes: ");
        int mes = teclado.nextInt();
        System.out.println("Ingrese en año: ");
        int año = teclado.nextInt();
        if (año>1990 && año<2010 && dia<=31 && mes <=12) {
            System.out.println("Si es correcto");
        }else if(año<1990 && año>2010 && dia<=31 && mes <=12){
                System.out.println("No es correcto");
            }
        }
    }
