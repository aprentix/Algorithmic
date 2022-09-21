import java.lang.Math;
public class auxiliaresArray {
    public static void showArray(int[] cad){
        for (int i = 0; i < cad.length; i++) {
            System.out.print(cad[i]+" ");
        }
        System.out.println();
    }
    public static int[] randomArray(){
        // It generes an array length 10 of random numbers
        int[] aux = new int[10];
        for(int i=0; i<10; i++){
            aux[i] = (int) Math.floor(Math.random()*(1000 - (-1000))-1000);
        }
        return aux;
    }
}
