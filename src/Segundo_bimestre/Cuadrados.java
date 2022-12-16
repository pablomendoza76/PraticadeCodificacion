package Segundo_Bimestre_Semana2;

public class Cuadrados {
    public static void main(String[] args) {
        int n[]={2,3,5,7,9,11,13};
        double cuadrado[]=new  double[n.length];
        for (int indice = 0; indice < n.length; indice++) {
            cuadrado[indice]=n[indice]*n[indice];

        }
        for (int indice = 0; indice < n.length; indice++) {
            System.out.println(cuadrado[indice]);
        }
    }
}
