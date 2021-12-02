import java.util.Arrays;

public class ParesImpares {

    public static int numerosPares(int[] nums){
       int contadorp = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2== 0){
                contadorp++;
            }
        }
        return contadorp;
    }

    public static int numerosImpares(int[] nums){
        int contadori = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i]%2!= 0){
                contadori++;
            }
        }
        return contadori;
    }

    public static void main(String[] args) {

        int [] numeros = new int[5];
        int minimo = 0;
        int maximo = 10;

        Utilidades.rellenaArray(numeros,minimo,maximo);
        System.out.println(Arrays.toString(numeros));

        System.out.println("En este array hay " + numerosPares(numeros) + " numeros pares");
        System.out.println("En este array hay " + numerosImpares(numeros) + " numeros impares");

    }
}
