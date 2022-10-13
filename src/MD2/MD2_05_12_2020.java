package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_05_12_2020 {
    public static int colina(int[] vector){
        return colinaAux(vector, 0, vector.length-1);
    }

    public static int colinaAux(int[] vector, int i0, int iN){
        if(i0==iN) return vector[i0];
        // necesita un caso base para un array con 2 elementos
        else if(vector.length==2) return vector[i0]>vector[iN]?vector[i0]:vector[iN];
        else{
            int k = (i0+iN)/2;
            if(vector[k]>vector[k+1]&&vector[k]>vector[k-1]) return vector[k];
            else if(vector[k]>vector[k+1]) return colinaAux(vector, i0, k-1);
            else return colinaAux(vector, k+1, iN);
        }
    }
    public static void main(String[] args) {
        int[] aux = {5,7,8,9,3,2,1,0,-7};
        int[] a1 = {14,8};
        for(int elem: a1) System.out.print(elem+" ");
        System.out.println();
        System.out.println(colina(a1));
    }
}
