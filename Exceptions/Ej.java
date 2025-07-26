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


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        int[] ar = { 1,2,2,5,6};

        prueba("hola", ar);

    }




        //Tenemos un procedimiento que recibe 2 parámetros un String, y un array de tipo 
        //entero unidimensional, Dentro del procedimiento se muestran unos mensajes de acuerdo a los 
        //parámetros recibidos, se debe controlar y colocar el código si se puede producir una excepción y
        //controlarla.

        public static void prueba(String dato,int[] vector){

            try{
                System.out.println(vector[vector[1]]);
            }catch(Exception e){
                System.out.println("indice del array fuera de rango");
            }

            try{
                System.out.println(dato.length());
            }catch(Exception e){
                System.out.println("String null, no se puede saber su largo");
            }




            System.out.println("Llegamos al final ok");
        }



        














    
    


}
