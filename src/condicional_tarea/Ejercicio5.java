package condicional_tarea;

import java.util.Scanner;

public class Ejercicio5{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("INGRESAR TRES NUMEROS ENTEROS");
        System.out.println("Primer numero: ");
        int num1 = teclado.nextInt();
        System.out.println("Segundo numero: ");
        int num2 = teclado.nextInt();
        System.out.println("Tercer numero: ");
        int num3 = teclado.nextInt();
        int hipotenusa=(num1*num2);
        int numm3=(num3*num3);
        if (hipotenusa==numm3){
            System.out.println("Son lados de un triangulo rectangulo");
        }else
            System.out.println("No son lados de una triangulo rectangulo");
    }
}