package StringChar;

public class Char {
    public static void main(String[] args) {
         System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS  CHAR");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();

        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Leer un char y decir si es letra, número o símbolo.

        char n = 'j';
        System.out.println(Character.isLetter(n));
        System.out.println(Character.isDigit(n));

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Ejercicio 2: Contar cuántas vocales hay en un array de char.

        char[] arrayChar = {'a', 'r', 'e', 'o', 'k','i', 'a'};
        int count = 0;

        for(int i = 0; i < arrayChar.length; i++){
            if (
                arrayChar[i] == 'a' || 
                arrayChar[i] == 'e'|| 
                arrayChar[i] == 'i' || 
                arrayChar[i] == 'o' || 
                arrayChar[i] == 'u'
            ) {
                count++;
            }
        }

        System.out.println(count);

        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Ejercicio 3: Dado un texto (String), recorrerlo letra por letra usando charAt y mostrar solo las letras mayúsculas.

        String hola = "Hola Como Estas";

        for(int i = 0; i < hola.length(); i++){
            char letra = hola.charAt( i);
            if (Character.isUpperCase(letra)) {
                            System.out.print(letra + " ");
            }
        }


    }
}
