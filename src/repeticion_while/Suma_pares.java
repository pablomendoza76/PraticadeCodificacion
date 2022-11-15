package repeticion_while;

/**
 * Programa para realizar la suma d elos numeros pares que existen del 1 al 100
 */
public class Suma_pares {
    public static void main(String[] args) {
        System.out.println("SUMA DE NUMEROS PARES DEL 1 AL 100");
        int suma_pares = 0;
        int num = 2;
        while (num <= 100) {
            if (num % 2 == 0) {
                suma_pares = suma_pares + num;

            }
            num = num +1;
        }
        System.out.println("La suma e los numeros pares es: "+ suma_pares);
    }
}