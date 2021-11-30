import java.util.Arrays;

public class Iguales {

    public static String comprobacion(int [] nums1,int [] nums2) {

        int contador = 0;
        for(int i =0; i< nums1.length; i++){
           if (nums1[i] == nums2[i]) {
               contador++;
           }
        }
        if (contador == nums1.length){
            System.out.println("Los dos vectores son iguales");
        } else System.out.println("Los vectores no son iguales");
        return "";
    }

    public static void main(String[] args) {

        int maximo = 3;
        int minimo = 0;
        int [] numeros1 = new int[3];
        int [] numeros2 =  new int[3];

        Utilidades.rellenaArray(numeros1,minimo,maximo);
        Utilidades.rellenaArray(numeros2,minimo,maximo);
        System.out.println(Arrays.toString(numeros1));
        System.out.println(Arrays.toString(numeros2));
        System.out.println(comprobacion(numeros1,numeros2));
    }
}
