package MD2.Ordenacion;
import Auxiliares.auxiliaresArray;
public class QuickSort extends auxiliaresArray{
    public static void OrdenarQuickSort(int[] vector){
        OrdenarQuickSortAux(vector, 0, vector.length-1);
    }
    public static void OrdenarQuickSortAux(int[] vector, int i0, int iN){
        if(i0>=iN) return;
        else{
            int m = OrdenarPorPivote(vector, i0, iN);
            OrdenarQuickSortAux(vector, i0, m-1);
            OrdenarQuickSortAux(vector, m+1, iN);
        }
    }
    public static int OrdenarPorPivote(int[] vector, int i0, int iN){
        // Situa los numeros menores que el pivote en su izierda y los mayores a su derecha
        // Si el puntero cuando a==b -> vector[a]>pivote retorna la posicion del pivote después de hacer el cambio
        // Si no,
        int a=i0,b=iN-1,c=vector[iN], aux;
        while(a<b){
            while(vector[a]<c && a<b) a++;
            while(vector[b]>c && a<b) b--;
            aux = vector[a]; vector[a]=vector[b]; vector[b]=aux;
        }
        if(vector[a]>c) {
            vector[iN] = vector[a];vector[a]=c; return a;
        }
        else return iN;
    }
    public static void main(String[] args) {
        int[] aux = randomArray();
        int[] ejem_2 = {1,2,3,4,5,6};
        showArray(aux);
        OrdenarQuickSort(aux);
        showArray(aux);
    }
}
