package Series;
import java.util.Arrays;

public class Series {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS  SERIES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();


        //Crear un programa que guarde los primeros 10 números de la serie de Fibonacci 
        //en un array y los imprima.

        int[] fib = new int[10];

        fib[0] = 0;
        fib[1] = 1;

        for(int i = 2; i < fib.length; i++){
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        System.out.println(Arrays.toString(fib));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Solicitar al usuario el tamaño del array y generar esa cantidad de números de Fibonacci.


        int n = 20;
        int[] fibN = new int[n];

        fibN[0] = 0;
        fibN[1] = 1;

        for(int i = 2; i < fibN.length; i++){
            fibN[i] = fibN[i - 1] + fibN[i - 2];
        }

        System.out.println(Arrays.toString(fibN));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Crear un array de 20 posiciones con la serie de Fibonacci y mostrar solo los números pares.

        int[] fibonacci = new int[20];

        fib[0] = 0;
        fib[1] = 1;

        int [] fibAux = new int[fibonacci.length];
        fibAux[0] = 0;
        fibAux[1] = 1;

        for(int i = 2; i < fibAux.length; i++){

            fibAux[i] = fibAux[i - 1] + fibAux[i - 2];

            if (fibAux[i]%2 == 0) {
                fibonacci[i] = fibAux[i];
            }
        }

        System.out.println(Arrays.toString(fibonacci));

    }
}
