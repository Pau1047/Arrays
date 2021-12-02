import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {

    public static void eliminarNumero (int posicion1, int[] nums ){

        int numeroEliminar = nums[posicion1];

        for(int i = posicion1; i<nums.length -1; i++){
           nums[i] = nums[i+1];
        }
        nums[nums.length -1]= numeroEliminar;
    }

    public static void main(String[] args) {

        Scanner introducir = new Scanner(System.in);

        int[] numeros = new int[5];
        int minimo = 0;
        int maximo = 10;

        Utilidades.rellenaArray(numeros,minimo,maximo);
        System.out.println("Estos son los numeros del Array " + Arrays.toString(numeros));
        System.out.println("Indica con un numero del 1 - 4 que posición quieres mover a la ultima posicion");
        int posicion = introducir.nextInt();
        eliminarNumero( posicion, numeros);
        System.out.println(Arrays.toString(numeros));



    }
}
