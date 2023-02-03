package MD5;
/*
Diseñar un método haySuma(int[] valores, int v)
con programación dinámica que permita saber si existe la suma
valor V en el array vector
*/
public class HaySuma {
    public static boolean haySuma(int[] valores, int v){
        boolean[][] hay= new boolean[v+1][valores.length];
        hay[0][0] = true;

        for (int i=1; i<=v; i++) hay[i][0]= (valores[0]==i);

        for (int j=1; j<valores.length; j++) {
            for (int i = 0; i <= v; i++) {
                if (hay[i][j - 1]) hay[i][j] = true;
                else if ((valores[j] <= i) && (hay[i - valores[j]][j - 1]))
                    hay[i][j] = true;
                else hay[i][j] = false;
            }
        }
        for (int j = 0; j < hay[0].length; j++) {
            System.out.print(String.format("%-6s",j)+" ");
        }
        System.out.println();
        for (int i = 0; i < hay.length; i++) {
            for (int j = 0; j < hay[0].length; j++) {
                System.out.print(String.format("%-6s",hay[i][j])+" ");
            }
            System.out.println();
        }
        return hay[v][valores.length - 1];
    }

    public static void main(String[] args) {
        int[] valores = {5,8,7,1,3,1};
        int v = 10;
        boolean res = haySuma(valores, v);
        System.out.println("Respuesta: "+res);
    }
}
