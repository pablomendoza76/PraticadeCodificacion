import java.util.Scanner;

public class ValorHipotenusa {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sacar el Valor de la Hipotenusa: ");
        System.out.println("Valor del Cateto A: ");
        double A = teclado.nextInt();
        System.out.println("Valor del Cateto B: ");
        double B = teclado.nextInt();
        double exp = 2;
        double C = Math.sqrt(Math.pow(A, exp) + Math.pow(B, exp));
        System.out.println("Resultado de la Hipotenusa: "+ C);
        }
    }
