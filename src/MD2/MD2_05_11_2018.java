package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_05_11_2018 {
    public static int buscaMinimoEnArrayCircular(int[] vector){
        return buscarMinimoEnArrayCircularAux(vector, 0, vector.length-1);
    }
    public static int buscarMinimoEnArrayCircularAux(int[] vector, int i0, int iN){
        if(i0==iN) {
            return vector[i0];
        }
        else{
            int k = (i0+iN)/2;
            if(vector[k]<vector[k+1]&&vector[k]<vector[k-1]){
                return vector[k];
            }
            else if(vector[k]<vector[iN]) {
                return buscarMinimoEnArrayCircularAux(vector, i0, k-1);
            }
            else {
                return buscarMinimoEnArrayCircularAux(vector, k+1, iN);
            }
        }
    }
    public static void main(String[] args) {
        int[] aux = {10,15,23,32,-8,-6,-5,1};
        showArray(aux);
        System.out.println(buscaMinimoEnArrayCircular(aux));
    }
}
