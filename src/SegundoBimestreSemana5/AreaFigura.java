package SegundoBimestreSemana5;

import java.util.Scanner;

public class AreaFigura {
    public static void main(String[] args) {
        System.out.println("promagrma de obtener el area de figuras geometricas");
        System.out.println("Digite 1 para obtener el area de una cicunferencia");
        System.out.println("Digite 2 para obtener el area de un cuadrado");
        System.out.println("Ditite 3 para obtener el area de un cilindro");
        Scanner teclado = new Scanner(System.in);
        int opcion = teclado.nextInt();
    }
    public static void seleccionar_figura (int opcion){
        switch (opcion){
            Scanner teclado = new Scanner(System.in);
            case 1:
                System.out.println("ingrese el valor del radio: ");
                double radio = teclado.NextInt();
                double area = obtener_area_circunferencia(radio);
                System.out.println("El area es: "+area);
                break;
        }
    }
    /**
     * metodo para hallar el area de una circunferencia
     * @param radio
     * @return
     */
    public double obtener_area_circunferencia (double radio ){
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    /**
     * metodo para obtener elarea de un cuadrado
     * @param lado
     * @return
     */
    public double obtener_area_cuadrado (double lado){
        double area = lado * lado;
        return area;
    }
}
