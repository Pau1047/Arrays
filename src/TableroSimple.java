public class TableroSimple {
    public static void ponxMatriz(char[][] tablero){
        for (int i =0; i<tablero.length; i++){
            for (int j=0; j<tablero[0].length; j++){
                if (i%2==0){
                    if (j%2==0){
                        tablero[i][j]= 'X';
                    }else tablero[i][j]= 'O';
                }
                if (i%2!=0){
                    if (j%2!=0){
                        tablero[i][j]= 'X';
                    }else tablero[i][j]= 'O';
                }
            }
        }
    }
    public static void enseñaMatriz(char[][] tablero){
        for (int i =0; i<tablero.length; i++){
            for (int j=0; j<tablero[0].length; j++){
                System.out.print(tablero[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        char[][] matriz = new char[5][5];
        ponxMatriz(matriz);
        enseñaMatriz(matriz);
    }
}

