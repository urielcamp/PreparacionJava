import java.util.LinkedList;

public class Main{
        public static void main(String[] args) {
            
System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS FACILES LINKEDLIST");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        //EJERCICIOS FACILES

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();

        //Crear una LinkedList de enteros y agregar 5 números

        LinkedList<Integer> enteros = new LinkedList<>();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(4);
        enteros.add(5);

        System.out.println(enteros);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Imprimir todos los elementos de una LinkedList usando un bucle for.

        for(int i = 0; i < enteros.size(); i++){
            System.out.print(enteros.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Obtener el primer y último elemento de una LinkedList.

        System.out.println(enteros.getFirst());
        System.out.println();
        System.out.println(enteros.getLast());


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Agregar un elemento al principio y otro al final de la lista.


        enteros.addFirst(0);
        enteros.addLast(6);

        System.out.println(enteros.getFirst());
        System.out.println();
        System.out.println(enteros.getLast());

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Eliminar el primer y el último elemento de la lista.

        enteros.removeFirst();
        enteros.removeLast();

        System.out.println(enteros.getFirst());
        System.out.println();
        System.out.println(enteros.getLast());

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Verificar si un número está en la lista.

        int Buscar = 4;

        if (enteros.contains(Buscar)) {
            System.out.println("el numero " + Buscar + " esta en la lista");
        }else{
            System.out.println(Buscar + " No esta en la lista");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println();

        //Reemplazar el segundo elemento por otro valor.

        enteros.set(1, 8);

        System.out.println(enteros);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println();

        //Vaciar completamente una lista.

        enteros.removeAll(enteros);

        System.out.println(enteros);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println();

        //Obtener la cantidad de elementos de la lista.

        System.out.println(enteros.size());






    }
}