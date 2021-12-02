import java.util.Arrays;

public class Duplicados {

    public static int numerosDuplicados(int [] nums){

        for(int i = 0; i<nums.length -1 ; i++){
            if(nums[i]== nums[i + 1]||nums[i]== nums[i + 2]||nums[i]== nums[i + 3]||nums[i]== nums[i + 4]){
                return nums[i];
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int [] numeros = new int[5];
        int maximo = 10;
        int minimo = 0;

        Utilidades.rellenaArray(numeros,minimo,maximo);
        System.out.println(Arrays.toString(numeros));
        if(numerosDuplicados(numeros) != 0){
            System.out.println("El numero " + numerosDuplicados(numeros) + " esta duplicado");
        } else if (numerosDuplicados(numeros) == 0){
            System.out.println("No hay ningun numero duplicado");
        }

    }
}