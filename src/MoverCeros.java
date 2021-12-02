import java.util.Arrays;

public class MoverCeros {

    public static void eliminarNumero (int posicion1, int[] nums ){

        int numeroEliminar = nums[posicion1];

        for(int i = 0; i<nums.length -1; i++){
            if(nums[i] == 0){
                nums[i] = nums[i+1];
            }
        }
        nums[nums.length -1]= numeroEliminar;

    }

    public static void main(String[] args) {
        int posicion = 0;
        int[] numeros =  {0,1,1,0,1,1};
        // int minimo = 0;
        //int maximo = 10;

        //Utilidades.rellenaArray(numeros,minimo,maximo);
        System.out.println("Estos son los numeros del Array " + Arrays.toString(numeros));
        eliminarNumero(posicion,numeros);
        System.out.println(Arrays.toString(numeros));

    }
}
