package EjerciciosExtraClase;

import java.util.Scanner;

public abstract class TeoremaPitagoras {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese valor de la hipotenusa: ");
        int hip = teclado.nextInt();
        System.out.println("Ingrese cateto 1: ");
        int cat1 = teclado.nextInt();
        System.out.println("Ingrese cateto 2: ");
        int cat2 = teclado.nextInt();
        double pot = Math.pow(cat1, cat2);
        int suma = cat1 + cat2;
        int hipo = hip * hip;
        if (hipo == suma) {
            System.out.println("Es un triangulo rectangulo");
        }
        if (hipo < suma) {
            System.out.println("Es un triangulo acutangulo");
        }
        if (hipo > suma) {
            System.out.println("Es un triangulo obtusangulo");
        }
    }
}