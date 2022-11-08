import java.util.Scanner;

public class SwitchArea {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Calculara areas:\n");
            int area = teclado.nextInt();
            switch (area) {
                case 1:
                    System.out.println("Ingresar base:\n");
                    double b = teclado.nextInt();
                    System.out.println("Ingresar altura:\n");
                    double h = teclado.nextInt();
                    double a = b * h /2;
                    System.out.println("area de un triangulo es:\n" + a);
                    break;
                case 2:
                    System.out.println("Ingreasar Radio:\n");
                    double r = teclado.nextInt();
                    double a2 = Math.PI * r * r;
                    System.out.println("area de un circulo es:\n" + a2);
                    break;
                case 3:
                    System.out.println("Ingresar lado:\n");
                    double l = teclado.nextInt();
                    double a3 = l * l;
                    System.out.println("area de un cuadrado es:\n" + a3);
                default:
                    System.out.println("Error");
                    }
        System.out.println("Fin del switch");

            }
        }