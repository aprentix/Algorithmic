public class Ordenar implements BasicosOrdenacion{

    @Override
    public void ordenacion_por_seleccion(int[] numeros) {
        int lowest_index, aux;
        for(int i=0; i< numeros.length; i++){
            // I must find the greatest number in the unorganized part
            lowest_index=i;
            for(int j=i+1; j< numeros.length; j++){
                if(numeros[lowest_index]>numeros[j]){
                    lowest_index = j;
                }
            }
            // We change the content of both positions
            aux = numeros[i]; numeros[i] = numeros[lowest_index]; numeros[lowest_index] = aux;
        }
    }

    @Override
    public void ordenacion_por_insercion(int[] numeros) {
        // I consider that the first element is ordered
        int auxiliar=0;
        for(int i=1; i< numeros.length; i++){
            j = i;
            while(numeros[j]>numeros[i]){
                numeros[j] = numeros[j-1];
                j--;
            }
            numeros[i] = numeros[j];
        }
    }

    @Override
    public void ordenacion_por_burbuja(int[] numeros) {

    }

    @Override
    public void heapsort(int[] numeros) {

    }

    @Override
    public void combsort(int[] numeros) {

    }
}
