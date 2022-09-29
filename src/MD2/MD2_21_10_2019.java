package MD2;
import Auxiliares.auxiliaresArray;


public class MD2_21_10_2019 extends auxiliaresArray{
    // Input : unorganized vector
    // Output : sum of positive numbers in the array
    // Complexit : N
    public static int sumaPositivos(int[] vector){
        return sumaPositivosAux(vector, 0, vector.length-1);
    }
    public static int sumaPositivosAux(int[] vector, int i0, int iN){
        if(i0==iN){
            if(vector[i0]>0) return vector[i0];
            else return 0;
        }
        else{
            int k = (i0+iN)/2;
            int positiveLeft = sumaPositivosAux(vector, i0, k);
            int positiveRight = sumaPositivosAux(vector,k+1, iN);
            return positiveLeft + positiveRight;
        }
    }
    public static int elementoSolitario(int[] vector){
        return elementoSolitarioAux(vector,0, vector.length-1);
    }
    public static int elementoSolitarioAux(int[] vector, int i0, int iN){
        if(i0==iN){
            return vector[i0];
        }
        else{
            int k = (int) Math.floor((i0+iN)/2);
            if(vector[k]!=vector[k+1]&&vector[k]!=vector[k-1]||vector.length==1) return vector[k];
            if(vector[k]==vector[k-1]) return elementoSolitarioAux(vector, k+1, iN);
            else return elementoSolitarioAux(vector, i0,k-1);
        }
    }
    public static void main(String[] args) {
        int[] auto = randomArray();
        showArray(auto);
        System.out.println(sumaPositivos(auto));
        int resultado = 0;
        for (int elem : auto){
            if(elem>0) resultado+=elem;
        }
        System.out.println(resultado);
        int[] ejem1 = {5,5,6,6,7,7,8,8,2,3,3,4,4};
        showArray(ejem1);
        elementoSolitario(ejem1);
    }
}
