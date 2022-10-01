package MD2;
import Auxiliares.auxiliaresArray;

public class MD2_07_11_2017 extends auxiliaresArray{
    public static int elementoEspecial(int[] vector){
        return elementoEspecialAux(vector, 0, vector.length-1);
    }
    public static int elementoEspecialAux(int[] vector, int i0, int iN){
        if(i0==iN){
            return i0;
            //if(vector[i0]==i0) return i0; // Si tubiese un array de un elemento y este fuese != 0
            //else return 0;
        }
        else{
            int k = (i0+iN)/2;
            if(vector[k]==k) return k;
            else if(vector[k]>k) return elementoEspecialAux(vector, i0, k-1);
            else return elementoEspecialAux(vector, k+1, iN);
        }
    }
    public static void main(String[] args) {
        int[] ordenados = {-10, -2, 0, 2, 7, 9, 19, 28, 30, 42, 55};
        int[] aux = {-1, 2};
        showArray(ordenados);
        System.out.println(elementoEspecial(ordenados));
    }
}
