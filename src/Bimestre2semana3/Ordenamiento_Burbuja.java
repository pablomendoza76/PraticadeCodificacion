package Bimestre2semana3;

public class Ordenamiento_Burbuja {
    public static void main(String[] args) {
        int numeros[] = {20,10,5,3,2,1};
        //CONTROLAMOS EL NUMERO DE PASADAS
        for (int indice = 1; indice <= numeros.length-1 ; indice++) {
            for (int elemento = 0; elemento <= numeros.length-2; elemento++) {
                //VERIFICAR SI REALIZAMOS EL INTERCAMBIO
                if (numeros[elemento]> numeros[elemento+1]){
                    int aux = numeros[elemento];
                    numeros[elemento]=numeros[elemento+1];
                    numeros[elemento+1]= aux;
            }
        }
    }
        //Mostrar arreglo ordenado
        for (int indice = 0; indice < numeros.length; indice++) {
            System.out.println(numeros[indice]);
        }
  }
}
