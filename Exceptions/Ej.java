package Exceptions;

public class Ej {
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS EXCEPCIONES EXAMEN");
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

        //Dividir dos números y manejar división por cero.

        int a = 4;
        int b = 0;
        int c = 2;


        try{
            System.out.println(a / c);
        }catch(Exception e){
            System.out.println("No se puede dividir entre 0");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Acceder a un índice inválido en un array y manejarlo.

        int[] arr = {1 , 2, 3, 4, 5};

        int x = 99;
        try{
            System.out.println(arr[c]);
        }catch(Exception e){
            System.out.println("Te saliste del indice del array");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Llamar length() sobre un String que puede ser null.

        String aa = null;

        try{
            System.out.println(aa.length());
        }catch(Exception e){
            System.out.println("El string es nulo");
        } 














    }
    


}
