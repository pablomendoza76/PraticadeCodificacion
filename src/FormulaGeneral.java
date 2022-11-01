import java.util.Scanner;

public class FormulaGeneral {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Sacar el Valor de la Formula General: 2");
        System.out.println("Valor de A: ");
        double A = teclado.nextInt();
        System.out.println("Valor de B: ");
        double B = teclado.nextInt();
        System.out.println("Valor de C: ");
        double C = teclado.nextInt();
        double exp = 2;
        double T = Math.sqrt(Math.pow(B, exp) - 4 * A * C);
        double x1 = (-B+T) / (2*A);
        double x2 = (-B-T) / (2*A);
        System.out.println("Resultado del valor x1: "+ x1);
        System.out.println("Resultado del valor x2: "+ x2);
    }
}
