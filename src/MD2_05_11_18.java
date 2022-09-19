public class MD2_05_11_18 {
    // Find the number minour in a array
    public static int buscaMenor(int[] cad){
        return buscaMenorAux(cad, 0, cad.length-1);
    }
    public static int buscaMenorAux(int[] cad, int i0, int iN){
        // Divide
        int k = (i0+iN)/2;
        // If you found the minour number of the array you have to return it
        if(cad[k]<cad[k-1]&&cad[k]<cad[k+1])
            return cad[k];
        else if(cad[k]<cad[iN])
            return buscaMenorAux(cad, i0, k);
        else
            return buscaMenorAux(cad, k+1, iN);
    }
    public static void printArray(int[] cad){
        for (int i = 0; i < cad.length; i++) {
            System.out.print(cad[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] ejem1 = {5,6,7,8,2,3,4};
        int[] ejem2 = {2,3,4};

        printArray(ejem2);
        System.out.println("Menor numero: " + buscaMenor(ejem1));
    }
}
