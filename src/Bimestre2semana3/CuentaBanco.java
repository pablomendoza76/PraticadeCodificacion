package Bimestre2semana3;

import java.util.Scanner;

public class CuentaBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String socio[] = {"Pablo", "Ivan", "Richar", "Andy", "David"};
        int cuenta[] = {1234, 4567, 8910, 1112, 1314};
        int saldo[] = {1200, 5000, 3000, 2500, 10000};
        boolean interruptor = true;
        while (interruptor) {
            for (int indice = 0; indice < cuenta.length; indice++) {
                System.out.println("ingrese numero de cuenta");
                int cuent = teclado.nextInt();
                if (cuenta[indice] == cuent) {
                    System.out.println("ingrese que opcion desea");
                    System.out.println("1.deposito");
                    System.out.println("2.retiros");
                    System.out.println("3.consuta de saldo");
                    System.out.println("4.salir");
                    int opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("deposito");
                            System.out.println("ingresar el valor a depsitar");
                            int deposito = teclado.nextInt();
                            for (int indice = 0; indice < cuenta.length; indice++) {

                            }
                    }
                }
            }
        }
    }
}
