

public class BuclesFor {
    public static void main(String[] args) {
        

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS FACILES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        // EJERCICIOS FACILES

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();

        //Imprimir los números del 1 al 10.

        for(int i = 1; i < 11; i++){
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Imprimir los números del 10 al 1 (en orden descendente).

        for(int i = 10; i > 0; i--){
            System.out.print(i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Imprimir los primeros 10 números pares.

        for(int i = 1; i < 11; i++){
            if(i%2 == 0){
                System.out.print(i+ " ");
            }
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Imprimir los primeros 10 números impares.

        for(int i = 1; i < 11; i++){
            if (i%2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Sumar los números del 1 al 100 e imprimir el resultado.

        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i;
        }

        System.out.println(sum);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Imprimir la tabla de multiplicar del 5.

        for(int i = 1; i <= 10; i++){
            int res = i * 5;
            System.out.println("5 * " + i + " = " + res);
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println();

        //Pedir un número n y mostrar los números del 1 a n.

        int n = 15;

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println();

        //Mostrar los múltiplos de 3 entre 1 y 30.

        for(int i = 1; i <= 30; i++){
            if (i%3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println();

        //Imprimir los números del 1 al 10, pero multiplicados por 2.
        for(int i = 1; i <= 10; i++){
            System.out.print(i * 2 + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println();

        //Mostrar los cuadrados de los números del 1 al 10.

        for(int i = 1; i <= 10; i++){
            System.out.print(i * i + " ");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS MEDIOS");
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

        //Mostrar la suma de los primeros 20 números impares.

        int sumaImpar = 0;
        for(int i = 1; i<= 20; i++){
            if (i%2 != 0) {
                sumaImpar = sumaImpar + i;
            }
        }

        System.out.println(sumaImpar);


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Mostrar los divisores de un número n 

        int nDiv = 25;

        for(int i = 1; i<= nDiv; i++){
            if (nDiv%i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Contar cuántos múltiplos de 5 hay entre 1 y 100.

        int count = 0;
        for(int i = 1; i <= 100; i++){
            if (i%5 == 0) {
                count ++;
            }
        }

        System.out.println(count );

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();
    

        //Mostrar la tabla de multiplicar de todos los números del 1 al 10.

        for(int i = 1; i <= 10; i++){
            System.out.println("Tabla del " + i);
            for(int j = 1; j <= 10 ; j++){
                System.out.print(i * j + " ");
            }
            System.out.println();
            System.out.println();
            
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Sumar los números pares del 1 al 100.

        int sumPares = 0;
        for(int i = 1; i <= 100; i++){
            if(i%2 == 0){
                sumPares += i;
            }
        }

        System.out.println(sumPares);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Mostrar los números del 1 al 100, pero si es múltiplo de 3 mostrar "Fizz",
        //si es múltiplo de 5 "Buzz", y si es de ambos "FizzBuzz".



        for(int i = 1; i <= 100; i++){
            if (i%3 == 0 && i%5 == 0) {
                System.out.println("FizzBuzz");
            }else if (i%5 == 0) {
                System.out.println("Buzz");
            }else if (i%3 == 0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }


                System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS DIFICILES");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


                // EJERCICIOS DIFICILES

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();

        //Invertir un número entero (ej: de 1234 → 4321) usando solo bucles y operaciones matemáticas.

        int num = 12345;

        int invertida = 0;

        for(; num != 0; num = num / 10){
            int digito = num % 10;
            invertida = invertida * 10 + digito;
        }        

        System.out.println(invertida);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Dibujar un triángulo de asteriscos creciente
        
        int figuras = 5;

        for(int i = 1; i <= figuras; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Dibujar un triángulo invertido:

        int fig = 6;

        for(int i = fig; i > 0; i--){
            for(int j = i; j > 0; j--){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Calcular el factorial de un número n (ej: 5! = 5×4×3×2×1).

        int nFac = 5;
        int cont = 1;

        for(int i = nFac; i > 0; i--){
            
            cont *= i;
        }

        System.out.println(cont);

                System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Dibujar un cuadrado de asteriscos de tamaño n

        int nC = 4;

        for(int i = 1; i <= nC; i++){
            //i = 1;
            if (i <= nC) {
                System.out.print("*");
                i++;
            }
            for(int j = 1; j <= i; j++){
                System.out.println();
            }
        }



    }
}
