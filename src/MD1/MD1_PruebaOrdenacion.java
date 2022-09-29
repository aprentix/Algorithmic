package MD1;
import Auxiliares.auxiliaresArray;

public class MD1_PruebaOrdenacion extends auxiliaresArray{
    public static void seleccionarOrdenacion(int i, int[] array){
        Ordenar ordenar = new Ordenar();
        switch(i){
            case 0:
                System.out.println("Ordenacion por seleccion: "); ordenar.ordenacion_por_seleccion(array);
                break;
            case 1:
                System.out.println("Ordenacion por insercion: "); ordenar.ordenacion_por_insercion(array);
                break;
            case 2:
                System.out.println("Ordenacion por burbuja: "); ordenar.ordenacion_por_burbuja_optimizado(array);
                break;
            case 3:
                System.out.println("Ordenacion por combsort: "); ordenar.combsort(array);
                break;
            case 4:
                System.out.println("Ordenacion por heapsort: "); ordenar.heapsort(array);
                break;
        }
    }

    public static void main(String[] args) {
        Ordenar ordenar = new Ordenar();
        // Genera 1 prueba diferentes para cada algoritmo
        int[] numbers;
        for(int i=0; i<4; i++){
            numbers = randomArray();
            System.out.println("Array desordenado: ");
            showArray(numbers);
            seleccionarOrdenacion(i, numbers);
            showArray(numbers);
        }
    }
}
