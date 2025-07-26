package EjExamenes;

public class ValidacionStrings {
    public static void main(String[] args) {

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS VALIDACION STRINGS EXAMEN");
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

        String palabra = "aei";
        System.out.println(validarVocal(palabra));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        String p = "sasd";

        System.out.println(palabraLetras(p));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();


        String pFV = "daasfe";
        System.out.println(palabraFirstVocal(pFV));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        String pL = "hola como estas hoy";
        char letra = 'o';

        System.out.println(contarLetras(pL, letra));
        


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        String pV = " a e i o u";

        System.out.println(contarVocales(pV));

        
    }

    //EJERCICIO EJEMPLO

    public static boolean validarVocal(String palabra){

        if(palabra == null){return false;}

        if (palabra.length() < 3 || palabra.length() > 6) {
            return false;
        }

        for(int i = 0; i < palabra.length(); i++){
            char c = Character.toLowerCase(palabra.charAt(i));
            if (
                c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u'
            ) {
                return false;
            }
        }

        return true;
    }


    //Verificar si una palabra contiene solo letras.

    public static boolean palabraLetras(String palabra){
        
        if(palabra == null){return false;}

        for(int i  = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);
            if (Character.isDigit(c)) {
                return false;
            }
        }

        return true;
    }

    //Verificar si una palabra comienza con vocal.

    public static boolean palabraFirstVocal(String palabra){

        if(palabra == null){return false;}



        if (
            palabra.charAt(0 ) != 'a' && palabra.charAt(0 ) != 'e' && palabra.charAt(0 ) != 'i' && palabra.charAt(0 ) != 'o' && palabra.charAt(0 ) != 'u'
            ) {
            return false;
        }

        return true;
    }


    //Contar cuántas veces aparece una letra específica.

    public static int contarLetras(String palabra, char letra){
        int count = 0;

        if (palabra == null) {
            return 0;
        }

        for(int i = 0; i < palabra.length(); i++){
            char c = palabra.charAt(i);

            if (
                c == letra
            ) {
                count++;
            }
        }

        return count;
    }


    //Contar cuántas vocales tiene un string.

    public static int contarVocales(String palabra){
        int count = 0;

        if(palabra == null){return 0;}

        for(int i = 0; i < palabra.length(); i++){
            char c = Character.toLowerCase(palabra.charAt(i));

            if(
                c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
            ){
                count++;
            }
        }

        return count;
    }




}
