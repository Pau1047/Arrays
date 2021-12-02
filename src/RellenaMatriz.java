public class RellenaMatriz {
    public static void ponxMatriz(int[][] tablero){
        int minimo = 0; int maximo = 1;

        for (int i =0; i<tablero.length; i++){
            for (int j=0; j<tablero[0].length; j++){
                Utilidades.rellenaMatriz(tablero,minimo,maximo);
            }
        }
    }
    public static void enseñaMatriz(int[][] tablero){
        for (int i =0; i<tablero.length; i++){
            for (int j=0; j<tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        ponxMatriz(matriz);
        enseñaMatriz(matriz);
    }
}


