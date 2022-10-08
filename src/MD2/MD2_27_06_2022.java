package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_27_06_2022 {
    public static int elementoRompeSecuencia(int[] vector){
        return elementoRompeSecuenciaAux(vector, 0, vector.length-1);
    }
    public static int elementoRompeSecuenciaAux(int[] vector, int i0, int iN){
        if(i0==iN) {
            return vector[i0];
        }
        else{
            int k = (i0+iN)/2;
            if(vector[k-1]%2==(k-1)%2&&vector[k]%2!=(k)%2) return vector[k];
            else if(vector[k]%2!=(k)%2){ return elementoRompeSecuenciaAux(vector, i0, k-1);}
            else return elementoRompeSecuenciaAux(vector, k+1, iN);
        }
    }
    public static void main(String[] args) {
        int[] aux = {2,5,8,9,22,34,45,98,101};
        showArray(aux);
        System.out.println(elementoRompeSecuencia(aux));
    }
}
