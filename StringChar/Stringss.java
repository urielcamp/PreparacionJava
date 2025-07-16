package StringChar;

public class Stringss {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS STRINGS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Leer un String y mostrar cuántos caracteres tiene.

        String hola = "hola";
        int count = 0;
        
        for(int i = 0; i < hola.length(); i++){
            count++;
        }

        System.out.println(count);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Verificar si un string contiene la palabra "java".

        String java = "yo estudio java";

            if (java.contains("java")) {
                System.out.println("Contiene la palabra java");
            }else{
                System.out.println("No contiene la palabra java");
            }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Convertir un string a minúsculas y luego a mayúsculas.

        String minMay = "HOLA";

        minMay = minMay.toLowerCase();
        System.out.println(minMay);
        System.out.println();
        
        minMay = minMay.toUpperCase();
        System.out.println(minMay);
        System.out.println();

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        // Invertir un string.

        String reversa = "lololin";
        
        for(int i = reversa.length() - 1; i >= 0; i--){
            
            char aux = reversa.charAt(i);
            System.out.print(aux);


        }

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        // Contar cuántas veces aparece una letra específica en una frase.

        String frase = "hola como estas mi loco tieso";
        int contador = 0;

        char letraEspecifica = 'o';

        for(int i = 0; i < frase.length(); i++){ 
        if (frase.charAt(i) == letraEspecifica) {
            contador++;
        }
    }

        System.out.println(contador);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        // Pedir dos strings y decir si son iguales (ignorando mayúsculas).

        String primero = "primero";
        String segundo = "segundo";

        System.out.println(primero.equalsIgnoreCase(segundo));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Reemplazar todas las letras 'a' por '@' en una frase.


        
        String otraFrase = "anaconda para donde vas";

        System.out.println(  otraFrase.replace("a", "@"));







    }
}
