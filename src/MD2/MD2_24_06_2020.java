package MD2;
import static Auxiliares.auxiliaresArray.*;

public class MD2_24_06_2020 {
    public static boolean existeSuma(int vecA[], int[] vecB, int suma){
        boolean encontrado = false;
        // ORDENAR vecB para reducir la complejidad del algoritmo
        for(int i=0; i<vecA.length && !encontrado; i++){
            encontrado = existeSumaAux(vecB, 0, vecB.length-1, suma, vecA[i]);
        }
        return encontrado;
    }
    public static boolean existeSumaAux(int[] vecB, int i0, int iN, int suma, int primer){
        if(i0==iN) return suma == vecB[i0]+primer;
        else{
            int k = (i0+iN)/2;
            if(vecB[k]+primer==suma) return true;
            else if(vecB[k]+primer>suma) return existeSumaAux(vecB, i0, k-1, suma, primer);
            else return existeSumaAux(vecB, k+1, iN, suma, primer);
        }
    }
    public static void mergeSort(int[] vector){
        mergeSortAux(vector, 0, vector.length-1);
    }
    public static void mergeSortAux(int[] vector, int i0, int iN){
        if(i0>=iN) return;
        else{
            int k = (i0+iN)/2;
            mergeSortAux(vector, i0, k);
            mergeSortAux(vector, k+1, iN);
            merge(vector, i0, k, iN);
        }
    }
   public static void merge(int[] vector, int i0, int k, int iN){
        int i=i0, d=k+1, f=0;
        int[] aux = new int[iN-i0+1];

       while(i<=k && d<=iN){
            if(vector[i]<=vector[d]){
                aux[f] = vector[i];
                i++;f++;
            }
            else {
                aux[f] = vector[d];
                d++;f++;
            }
        }
        for(int a=i; a<=k; a++){aux[f]=vector[a];f++;}
        for(int a=d; a<=iN; a++) {aux[f] = vector[a];f++;}
        for(int a=0; a<aux.length; a++) {vector[i0 + a] = aux[a];}
    }
    public static void main(String[] args) {
        int[] vecA = {8,4,3,2,-1};
        //int[] vecB = {-1,0,3,4,6,7,10};
        int[] vecB = {0,3,4,-1,6,10,7};
        showArray(vecB);
        mergeSort(vecB);
        showArray(vecA);
        showArray(vecB);
        System.out.println(existeSuma(vecA, vecB, -10));
    }
}
