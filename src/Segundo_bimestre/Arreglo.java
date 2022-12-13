package Segundo_bimestre;

public class Arreglo {
    public static void main(String[] args) {
        //creacion de arreglos con valores predefinidos
        String universidades [] = {"utpl","unl","espol","ucuenca","usfg"};
        int tam = universidades.length;// obtenemos el tamaño del arreglo
        System.out.println("tamaño del arreglo: "+ tam);
        for (int indice = 0; indice < 5 ; indice++) {
            System.out.println(universidades[indice] + "\t");

        }
        //Creacion de un arreglo tipo entero
        int notas[] = {7,8,5,4,10};
        for (int indice = 0; indice < notas.length ; indice++) {
            System.out.println(notas[indice]);
        }
        //Creacion de un arreglo de tipo char
        char vocales [] = {'a','e','o','u'};
        for (int indice = 0; indice < vocales.length; indice++) {
            System.out.println(vocales[indice]);
        }
            //Creacion de un arreglo de tipo boolean
            boolean valores[]={true,false,false,true,true};
            for (int indice = 0; indice < valores.length; indice++){
                System.out.println(valores[indice]);
            }
            //creacion de un arreglo tipo decimal
            double numeros[] = {1.0,2.5,3.1};
        }
    }

