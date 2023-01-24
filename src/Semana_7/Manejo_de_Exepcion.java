package Semana_7;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * PROGRAMA PARA REAKIZAR LA DIVISION DE DOS NUMEROS
 */
public class Manejo_de_Exepcion {
    //creacion de variables globales
    double n1;
    double n2;

    public static void main(String[] args) {
        Manejo_de_Exepcion mivar = new Manejo_de_Exepcion();
        mivar.ejecutar();
    }

    public void ejecutar() {
        ingresar_datos();
        System.out.println("Resultado= " + dividir());
    }

    public void ingresar_datos() {
        try {// Este codigo tiene la posivilidad de presentar una exepcion
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingrese numerador");
            n1 = teclado.nextDouble();
            System.out.println("ingrese deniminador");
            n2 = teclado.nextDouble();
        }catch (Exception error) {
            System.out.println("Manejo de exepcion tipo entrada de datos");
            System.out.println(error.getMessage());
        }
    }
        public double dividir(){
            double resultado = 0;
            try {
                resultado = n1 / n2;
            } catch (Exception error) {
                //este codigo se ejecuta solo si ocurre la exepcion
                System.out.println("error de tipo arimetrico ");
                System.out.println(error.getMessage());
            }finally {
                //este codigo se ejecuta ocurra o no la exepcion
                System.out.println("ingreso a finally");
            }
            return resultado;
        }
    }
