package MD2;
import Auxiliares.auxiliaresArray;

public class MD2_11_2021 extends auxiliaresArray{
    public static int longMaxSubArrayOrdenado(int[] vector){
        return longMaxSubArrayOrdenadoAux(vector, 0, vector.length-1);
    }
    public static int longArrayCentro(int[] vector, int k){
        int i = k;
        int longitud = 1;
        while(vector[i]>vector[i-1]) longitud++; i--;  // ampliamos a la izquierda
        i = k;
        while(vector[i]<vector[i+1]) longitud++; i++;  // ampliamos a la derecha
        return longitud;
    }
    public static int longMaxSubArrayOrdenadoAux(int[] vector, int i0, int iN){
        if(i0==iN){
            return 1; // longitud de un array de un solo elemento -> este siempre está ordenado
        }
        else{
            int k = (i0+iN)/2;
            // El debuger da problemas con longMaxSubArrayOrdenadoAux, no funciona
            int izquierda = longMaxSubArrayOrdenadoAux(vector, i0, k-1);
            int derecha = longMaxSubArrayOrdenadoAux(vector, k+1, iN);
            int centro = longArrayCentro(vector, k);

            int mayor = izquierda>derecha?izquierda:derecha;
            return mayor>centro?mayor:centro;
        }
    }
    public static void main(String[] args) {
        int[] aux = {2,1,1,3,2,4,7,15,1};
        showArray(aux);
        System.out.println(longMaxSubArrayOrdenado(aux));
    }
}
