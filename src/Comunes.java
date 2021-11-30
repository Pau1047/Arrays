import java.util.Arrays;

public class Comunes {

    public static String elementosComunes(int[] nums1, int[] nums2){

        for(int j = 0; j< nums2.length;j++ ){
            for(int i = 0; i< nums1.length; i++){
                if (nums2[j] == nums1[i]){
                    System.out.println("El numero " + nums1[i] + " se repite en los dos arrays");;
                }
            }
        }
        return "No hay ningun numero que coincida en los dos arrays";
    }

    public static void main(String[] args) {

        int maximo = 10;
        int minimo = 0;
        int [] numeros1 = new int[5];
        int [] numeros2 = new int[5];

        Utilidades.rellenaArray(numeros1,minimo,maximo);
        Utilidades.rellenaArray(numeros2,minimo,maximo);
        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));

        System.out.println(elementosComunes(numeros1,numeros2));


    }
}
