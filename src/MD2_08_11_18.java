public class MD2_08_11_18 {
    // Find the number UNIQUE in an array (LOG N)
    public static int buscaUnico(int[] cad){
        return buscaUnicoAux(cad, 0, cad.length-1);
    }
    public static int buscaUnicoAux(int[] cad, int i0, int iN){
        // Divide
        int k = (i0+iN)/2;
        // If you found the unique number in the array return it and that's all
        if(cad[k]!=cad[(k-1)%cad.length+1] && cad[k]!=cad[(k+1)% cad.length+1])
            return cad[k];
        else if(cad[k]==cad[k+1])
            return buscaUnicoAux(cad, i0, k); // I search in the left side
        else
            return buscaUnicoAux(cad, k+1, iN); // I search in the right side
    }
    public static void printArray(int[] cad){
        for (int i = 0; i < cad.length; i++) {
            System.out.print(cad[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] ejem1 = {5,5,6,6,7,7,8,8,2,3,3,4,4};
        int[] ejem2 = {2,3,3,4,2};

        printArray(ejem2);
        System.out.println("Numero unico: " + buscaUnico(ejem1));
    }
}
