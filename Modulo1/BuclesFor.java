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
    }
}
