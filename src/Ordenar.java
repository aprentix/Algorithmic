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
        int aux = 0, j;
        for(int i=1; i< numeros.length; i++){
            aux = numeros[i];
            j = i;
            while( j>0 && aux<numeros[j-1] ){
                numeros[j] = numeros[j-1];
                j--;
            }
            numeros[j] = aux;
        }
    }

    @Override
    public void ordenacion_por_burbuja(int[] numeros) {
        // We start filling the gaps in the end of the array
        // Getting the greatests number in the last position
        int aux;
        for(int j = numeros.length-1; j>0; j--){
            for(int i=0; i<j; i++){
                if(numeros[i]>numeros[i+1]){
                    aux = numeros[i]; numeros[i]=numeros[i+1]; numeros[i+1]=aux;
                }
            }
        }
    }

    @Override
    public void ordenacion_por_burbuja_optimizado(int[] numeros) {
        // If the array is ordered you don't have to continue checking n**2 times
        int j = numeros.length-1;
        int aux;
        boolean ordered=false;
        while(!ordered){
            ordered = true;
            for(int i=0; i<j; i++){
                if(numeros[i]>numeros[i+1]){
                    aux = numeros[i]; numeros[i]=numeros[i+1];numeros[i+1]=aux;
                    ordered=false;
                }
            }
            j--;
        }
    }

    @Override
    public void heapsort(int[] numeros) {

    }

    @Override
    public void combsort(int[] numeros) {
        boolean ordenado = false;
        int gap = numeros.length-1;
        while(!ordenado||gap>1){
            gap = (int) Math.floor(gap/1.3);
            ordenado=true;
            int i=0;
            while(i+gap<numeros.length){
                if(numeros[i]>numeros[i+gap]){
                    int aux = numeros[i]; numeros[i]=numeros[i+gap];numeros[i+gap]=aux;
                    ordenado=false;
                }
                i++;
            }
        }
    }

}
