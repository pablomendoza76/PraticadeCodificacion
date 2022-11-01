import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        System.out.println("Sacar el Area de una Circunferencia: ");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Colocar el valor del Radio");
        double r = teclado.nextInt();
        double exp = 2;
        double area = Math.PI* Math.pow(r, exp);
        System.out.println("Resultado del Area: "+ area);
    }
}
