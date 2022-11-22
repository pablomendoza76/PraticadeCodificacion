package estructura_for;

import java.security.spec.PSSParameterSpec;
import java.util.Scanner;

public class SumaImpar {
    public static void main(String[] args) {
        System.out.println("ingrese un numero limite");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();
        int suma_impares = 0;
        for (int contador = 1; contador <= limite; contador = contador+2){
                suma_impares = suma_impares + contador;

        }
        System.out.println("La suma de numeros impares = "+suma_impares);
    }
}
