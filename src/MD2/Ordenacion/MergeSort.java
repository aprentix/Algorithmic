package MD2.Ordenacion;
import static Auxiliares.auxiliaresArray.*;

public class MergeSort{
    public static void mergeSortAux(int[] vector, int i0, int iN){
        if(i0 >= iN) return;
        else{
            int k = (i0+iN)/2;
            mergeSortAux(vector, i0, k);
            mergeSortAux(vector, k+1, iN);
            merge(vector, i0, k, iN);
        }
    }
    public static void mergeSort(int[] vector){
        mergeSortAux(vector, 0, vector.length-1);
    }
    public static void merge(int[] vector, int i0, int k, int iN){
        int[] aux = new int[iN-i0+1];
        int a=i0,b=k+1, c=0;
        while(a<=k && b<=iN){
            if(vector[a]<=vector[b]) { aux[c]=vector[a]; a++;}
            else {aux[c]=vector[b]; b++;}
            c++;
        }
        //Colocar los posibles numeros que no se hayan colocado, en orden
        for(int i=a; i<=k; i++){aux[c]=vector[i];c++; }
        for(int i=b; i<=iN; i++){aux[c]=vector[i];c++; }
        for(int i=0; i<aux.length; i++) { vector[i0+i] = aux[i]; }
    }
    public static void main(String[] args) {
        int[] vector = randomArray();
        showArray(vector);
        mergeSort(vector);
        showArray(vector);
    }
}
