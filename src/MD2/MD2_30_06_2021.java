package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_30_06_2021 {
    public static int posicionArraysDiff(int[] vecA, int[] vecB){
        return posicionArraysDiffAux(vecA, vecB, 0, vecA.length-1);
    }
    public static int posicionArraysDiffAux(int[] vecA, int[] vecB, int i0, int iN){
        if(i0==iN) {
            if(vecA[i0]!=vecB[i0]) return i0;
            else return -1;
        }
        else{
            int k = (i0+iN)/2;
            if(vecA[k]!=vecB[k]) return posicionArraysDiffAux(vecA, vecB, i0, k);
            else return posicionArraysDiffAux(vecA, vecB, k+1, iN);
        }
    }
    public static void main(String[] args) {
        int[] vecA = {-4,-2,0,1,1,2,3,4,-9};
        int[] vecB = {-4,-2,0,1,1,5,7,10,-6};
        showArray(vecA);
        showArray(vecB);
        System.out.println(posicionArraysDiff(vecA, vecB));
    }
}
