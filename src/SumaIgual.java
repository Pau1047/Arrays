import java.util.Arrays;
import java.util.Scanner;

public class SumaIgual {

    public static int numerosPares(int[] nums){
        int contadorp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2== 0){
                contadorp++;
            }
        }
        return contadorp;
    }

    public static void main(String[] args) {

        int [] numeros = new int[5];
        int minimo = 0;
        int maximo = 10;

        Utilidades.rellenaArray(numeros,minimo,maximo);
        System.out.println(Arrays.toString(numeros));

        Scanner introducir = new Scanner(System.in);
        System.out.println("Escriba a continuación un numero y se le mostrara si hay numeros pares que su suma sea igual al numero introducido");
    }
}
