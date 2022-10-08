package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_08_11_2019 {
    public static int unicoElemento(int[] vector){
        return unicoElementoAux(vector, 0, vector.length-1);
    }
    public static int unicoElementoAux(int[] vector, int i0, int iN){
        if(i0==iN) return vector[i0];
        else{
            int k = (i0+iN)/2;
            if(vector[k]!=vector[k+1]&&vector[k]!=vector[k-1]) return vector[k];
            else if(vector[i0]==vector[iN]){
                if(vector[k]==vector[k-1]&&k%2==0) return unicoElementoAux(vector, k+1, iN);
                else return unicoElementoAux(vector, i0, k-1);
            }
            else{
                if(vector[k]!=vector[k-1]&&k%2==1) return unicoElementoAux(vector, i0, k-1);
                else return unicoElementoAux(vector, k+1, iN);
            }
        }
    }
    public static void main(String[] args) {
        int[] aux = {1,2,2,3,3,4,0,0,1};
        int[] aux_2 = {1,1,2,2,3,3,5};
        int[] aux_3 = {5,3,3,2,2,1,1};
        showArray(aux_3);
        System.out.println(unicoElemento(aux_3));
    }
}
