package Series;
import java.util.Arrays;

public class Series {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS  SERIES FIBONACCI");
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


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS  SERIES PADOVAN");
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

        //Crear un programa que genere los primeros 12 números de la serie de Padovan en un array.

        int[] pad = new int[20];

        pad[0] = pad[1] = pad[2] = 1;

        for(int i = 3; i < pad.length; i++){
            pad[i] = pad[i - 2] + pad[i - 3];
        }

        System.out.println(Arrays.toString(pad));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Mostrar todos los números impares de la serie Padovan entre los primeros 20.

        int[] padImpar = new int[20];

        padImpar[0] = padImpar[1] = padImpar[2] = 1;

        int[] padAux = new int[padImpar.length];
        padAux[0] = padAux[1] = padAux[2] = 1;

        for(int i = 3; i < padAux.length; i++){
            padAux[i] = padAux[i - 2] + padAux[i - 3];

            if (padAux[i]%2 != 0) {
                padImpar[i] = padAux[i];
            }
        }

        System.out.println(Arrays.toString(padImpar));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Pedir al usuario el tamaño de la serie y llenar un array con la serie de Padovan hasta ese tamaño.

        int nUser = 20;

        int[] padovan = new int[n];

        padovan[0] = padovan[1] = padovan[2] = 1;

        for(int i = 3; i < padovan.length; i++){
            padovan[i] = padovan[i-2] + padovan[i-3];
        }

        System.out.println(Arrays.toString(padovan));


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

        //Crear un array con los primeros 15 números de la serie Tribonacci. Los tres primeros son 0, 0, 1.

        int[] tribonacci = new int[15];

        tribonacci[0] = tribonacci[1] = 0;
        tribonacci[2] = 1;

        for(int i = 3; i < tribonacci.length; i++){
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i-3];
        }

        System.out.println(Arrays.toString(tribonacci));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Crear un array con los primeros 20 números de la serie Tetranacci.

        int[] tetranacci = new int[20];

        tetranacci[0] = tetranacci[1] = tetranacci[2] = 0;
        tetranacci[3] = 1;

        for(int i = 4; i < tetranacci.length; i++){
            tetranacci[i] = tetranacci[i - 1] + tetranacci[i-2] + tetranacci[i-3] + tetranacci[i-4];
        }

        System.out.println(Arrays.toString(tetranacci));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();


        // Definición:
        //P(n) = P(n−2) + P(n−3)
        //Crear un array con los primeros 15 términos de la serie de Perrin.
        
        int[] perrin = new int[15];

        perrin[0] = 3;
        perrin[1] = 0;
        perrin[2] = 2;

        for(int i = 3; i < perrin.length; i++){
            perrin[i] = perrin[i-2] + perrin[i-3];
        }

        System.out.println(Arrays.toString(perrin));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Implementar la serie Hofstadter Q hasta el elemento 20. Usar array y precaución con los índices.
        //Definición:
        //Q(n) = Q(n - Q(n - 1)) + Q(n - Q(n - 2))

        int[] hofstadterQ = new int[20];

        hofstadterQ[0] = hofstadterQ[1] = 1;

        for(int i = 2; i < hofstadterQ.length; i++){
            hofstadterQ[i] = hofstadterQ[i - hofstadterQ[i - 1]] + hofstadterQ[i - hofstadterQ[i - 2]];
        }

        System.out.println(Arrays.toString(hofstadterQ));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Crear un array con los primeros 15 números de la serie de Jacobsthal.

        int[] jacobsthal = new int[15];

        jacobsthal[0] = 0;
        jacobsthal[1] = jacobsthal[2] = 1;

        for(int i = 3; i < jacobsthal.length; i++){
            jacobsthal[i] = jacobsthal[i - 1] + 2*jacobsthal[i-2];
        }

        System.out.println(Arrays.toString(jacobsthal));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Crear un array con los primeros 20 elementos de la serie de Narayana.

        int[] narayana = new int[20];

        narayana[0] = narayana[1] = narayana[2] = 1;

        for(int i = 3; i < narayana.length; i++){
            narayana[i] = narayana[i - 1] + narayana[i - 3];
        }

        System.out.println(Arrays.toString(narayana));



        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS  SERIES ARITMETICAS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();

        //Crear un array con los primeros múltiplos de 3 del 1 al 10.

        int[] multiplosTres = new int[10];

        for(int i = 0; i < multiplosTres.length; i++){
            if (i%3 == 0) {
                multiplosTres[i] = i;
            }
        }

        System.out.println(Arrays.toString(multiplosTres));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Generar una serie que comienza en 5 y suma 4 en cada paso (5, 9, 13...).

        int[] serieCinco = new int[20];

        serieCinco[0] = 5;

        for(int i = 1; i < serieCinco.length; i++){

            serieCinco[i] = serieCinco[i - 1] + 4;

        }

        System.out.println(Arrays.toString(serieCinco));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();


        //Crear un array con los primeros 15 números impares.

        int[] impares = new int[15];

        for(int i = 1; i < impares.length ; i++){
            
                impares[i] = 2 * i + 1;
        }
    
        System.out.println(Arrays.toString(impares));


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Generar una serie descendente de 100 en pasos de 5.

        int[] descendente = new int[20];
        descendente[0] = 100;

        for(int i = 1; i < descendente.length; i++){
            descendente[i] = descendente[i - 1] - 5;
        }

        System.out.println(Arrays.toString(descendente));

        
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Crear una serie alternando entre sumar 2 y restar 1 (ej: 1, 3, 2, 4, 3...).

        int[] sumaResta = new int[10];
        sumaResta[0] = 1;

        for(int i = 1; i< sumaResta.length; i++){
            if (i%2 != 0) {
                sumaResta[i] = sumaResta[i - 1] + 2;
            }else{
                sumaResta[i] = sumaResta[i - 1] - 1;
            }
        }

        System.out.println(Arrays.toString(sumaResta));












    }
}
