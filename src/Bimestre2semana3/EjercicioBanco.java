import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class EjercicioBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String socios[] = {"Pablo","Iván","Richar","Andy","David"};
        int cuentas[] = {1234,4567,8910,1112,1314};
        int saldos[] = {1200,5000,3000,2500,10000};
        boolean interruptor = true;
        System.out.println("Ingrese su número de cuenta: ");
        int cuenta = teclado.nextInt();
        int casilla = 0;
        for (int indice = 0; indice < cuentas.length; indice++) {
            if (cuentas[indice] == cuenta) {
                System.out.println("Cuenta valida");
                casilla = indice;
                System.out.println("Bienvenido a su Banco digital");
            }
        }
        if (cuentas[casilla] != cuenta) {
            System.out.println("Cuenta incorrecta");
            interruptor = false;
        }
        while (interruptor == true) {
            System.out.println("Menú de servicios");
            System.out.println("1.deposito");
            System.out.println("2.retiros");
            System.out.println("3.consuta de saldo");
            System.out.println("4.salir");
            System.out.println("Que opcion desea realizar :");
            int opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese la cantidad del depósito: ");
                    int deposito = teclado.nextInt();
                    saldos[casilla] = saldos[casilla] + deposito;
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad que desea retirar: ");
                    int retiro = teclado.nextInt();
                    if (retiro > saldos[casilla]) {
                        System.out.println("Saldo insuficiente");
                    }
                    saldos[casilla] = saldos[casilla] - retiro;
                    break;
                case 3:
                    System.out.println("Su saldo es : ");
                    System.out.println(saldos[casilla]);
                    break;
                default:
                    System.out.println("PROGRAMA FINALIZADO");
                    interruptor = false;
            }
        }
    }
  }

