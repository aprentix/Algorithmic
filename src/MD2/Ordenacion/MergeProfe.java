package MD2.Ordenacion;

import static Auxiliares.auxiliaresArray.*;

public class MergeProfe {
    public static void mergeSortAux(int[] vector, int i0,int iN){
        if(i0 >= iN) return;
        else {
            int k= (i0 + iN) /2;
            mergeSortAux(vector, i0, k);
            mergeSortAux(vector, k+1, iN);
            merge(vector, i0, k, iN);
        }
    }
    public static void mergeSort(int[] vector) {
        mergeSortAux(vector,0, vector.length-1);
    }
    public static void merge(int[] vector, int i0,int k, int iN){
        int i=i0, d=k+1, f=0;
        int[] aux=new int[iN-i0+1];

        while (i<=k && d<=iN)
        {
            if (vector[i]<=vector[d]) {
                aux[f] = vector[i];
                i++; f++;
            } else {
                aux[f] = vector[d];   d++; f++;
            }
        }
        for(int a=i; a<=k; a++) {aux[f]= vector[a]; f++;}
        for(int a=d; a<=iN; a++) {aux[f]= vector[a]; f++;}
        for(int a=0; a<aux.length; a++) {vector[i0+a]= aux[a];}
    }
    public static void main(String[] args) {
        int[] vector = randomArray();
        showArray(vector);
        mergeSort(vector);
        showArray(vector);
    }
}
