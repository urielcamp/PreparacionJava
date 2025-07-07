import java.util.LinkedList;
import java.util.Arrays;

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

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS MEDIOS LINKEDLIST");
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

        //Recorrer la lista al revés (sin usar descendingIterator).

        LinkedList<Integer> numeros = new LinkedList();

        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        for(int i = numeros.size() - 1; i >= 0; i--){
            System.out.print(numeros.get(i) + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Sumar todos los elementos de una lista de enteros.

        int sum = 0;

        for(int i = 0; i < numeros.size(); i++){
            sum = sum + numeros.get(i);
        }

        System.out.println(sum);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Encontrar el valor máximo y mínimo de la lista.

        int max = numeros.get(0);
        int min = numeros.get(0);

        for(int i = 0; i <= numeros.size() - 1; i++){
            int valor = numeros.get(i);
            if (valor > max ) {
                max = valor;
            }

            if (valor < min) {
                min = valor;
            }
        }

        System.out.println("el maximo de la lista es " + max);
        System.out.println();
        System.out.println("el minimo de la lista es " + min);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Eliminar todos los elementos que sean menores que 10

        LinkedList<Integer> m = new LinkedList<>();

        m.add(123);
        m.add(23);
        m.add(2);
        m.add(12);
        m.add(5);
        m.add(45);
        m.add(68);
        m.add(98);


        System.out.println(m + " ");
        for(int i = 0; i <= m.size() - 1; i++){
            int valor = m.get(i); 
            if (valor < 10) {
                m.remove(i);
            }
        }

        System.out.println(m + " ");


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Insertar un valor en la posición 3 de la lista.

        m.add(3, 88);

        System.out.println(m);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS FACILES ARRAYS");
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

        //Crear un array de 5 enteros y mostrar sus valores.

        int[] ent = {1, 2, 3, 4 , 5 };

        System.out.println(Arrays.toString(ent));
        

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Llenar un array de tamaño 10 con los números del 1 al 10.

        int[] nu = new int[10];

        nu[0] = 1;
        nu[1] = 2;
        nu[2] = 3;
        nu[3] = 4;
        nu[4] = 5;
        nu[5] = 6;
        nu[6] = 7;
        nu[7] = 8;
        nu[8] = 9;
        nu[9] = 10;

        System.out.println(Arrays.toString(nu));

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Imprimir los valores de un array en orden inverso.


        for(int i = nu.length - 1; i >= 0; i--){
            System.out.print(nu[i] + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Calcular la suma de todos los elementos de un array.

        int s = 0;

        for(int i = 0; i < nu.length; i++){
            s += nu[i];
        }

        System.out.println(s);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Calcular el promedio de los elementos de un array.

        int sm = 0;

        for(int i = 0; i < nu.length; i++){
            sm += nu[i];
        }
        
        double pm = sm / nu.length;
        System.out.println(pm);
        

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Contar cuántos números pares hay en un array.

        int c = 0;

        for(int i = 0; i < nu.length; i++){
            if (nu[i]%2 == 0) {
                c++;
            }
        }

        System.out.println("el array tiene " + c + " numeros pares");

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println();

        //Buscar un número específico dentro de un array.

        int indice = Arrays.binarySearch(nu, 4);

        System.out.println(indice);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println();

        //Copiar los elementos de un array en otro array.

        int[] otroArray = new int[nu.length];

        for(int i = 0; i < nu.length; i++){
                otroArray[i] = nu[i];
        }

        System.out.println(Arrays.toString(otroArray));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println();
        
        //Multiplicar todos los elementos del array por 2.

        for(int i = 0; i < otroArray.length; i++){
            otroArray[i] = otroArray[i] * 2;
        }

        System.out.println(Arrays.toString(otroArray));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println();

        //Verificar si un número ingresado por el usuario está en el array.

        int nUser = 9;

        boolean esta = true;

        //System.out.println(Arrays.binarySearch(nu, nUser));

        if (Arrays.binarySearch(nu, nUser) > 0) {
            esta = true;
        }else{
            esta = false;
        }

        if (esta) {
            System.out.println("el numero " + nUser + " esta en el array");
        }else{
            System.out.println("el numero no se encuentra en el array");
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS MEDIOS ARRAYS");
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

        //Encontrar el valor máximo y mínimo de un array

        int[] numArrays = {1, 3, 54, 5, 34, 2, 56, 90, 32, 4523, 4, 0};

        int mayor = 1;

        int menor = 1;

        for(int i = 0; i < numArrays.length; i++){
            if (mayor < numArrays[i]) {
                mayor = numArrays[i];
            }

            if (menor > numArrays[i]) {
                menor = numArrays[i]; 
            }
        }

        System.out.println(mayor);
        System.out.println();
        System.out.println(menor);



        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Invertir un array sin usar otro array auxiliar.

        int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        for(int i = 0; i < array.length / 2 ; i++){
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(array));


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Eliminar todos los números negativos de un array (reconstruyendo otro array).

        int[] arrOrigin = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5};

        int[] arrRec = new int[arrOrigin.length];

        for(int i = 0; i < arrOrigin.length; i++){
            if (arrOrigin[i] > 0) {
                arrRec[i] = arrOrigin[i];
            }
        }

        System.out.println(Arrays.toString(arrRec));


        
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Contar cuántas veces se repite un número específico en el array.

        int[] arrRep = {1,2,3,3,4,4,4,5,2,2};

        int count = 0;
        int n = 3;



        for(int i = 1; i < arrRep.length; i++){
            if (arrRep[i] == n) {
                count++;
            }
        }

        System.out.println(count);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Crear un array con los primeros 10 números impares.


        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17};
        int[] newArray = new int[11];
        for(int i = 0; i <= 11; i++){
            if (arr[i]%2 == 0) {
                
            }else{
                newArray[i] = arr[i];
            }
        }

        System.out.println(Arrays.toString(newArray));



        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Sumar los valores en posiciones pares e impares por separado.


        int contadorPar = 0;
        int contadorImpar = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i]%2 == 0) {
                contadorPar += arr[i];
            }else{
                contadorImpar += arr[i];
            }
        }


        System.out.println("La suma de los valores pares son: " + contadorPar + " y de los impares es: " + contadorImpar);

        

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS FACILES CLASES Y OBJETOS");
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

        //Crear una clase Animal con atributos especie y edad, y sobrecargar 2 constructores.

        Animal leon = new Animal("Leon ",10);


        leon.mostrarAnimal();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Crear una clase Auto con marca y año. Crear 3 objetos con diferentes constructores.

        Auto fiat = new Auto("Fiat",2013);

        fiat.mostrarAuto();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Crear una clase Libro con título, autor y año. Mostrar la información con un método.

        Libro borraDelCafe = new Libro("Borra del Cafe", "Benedetti", 1992);

        borraDelCafe.mostrarLibro();


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Clase Estudiante con nombre, edad y carrera. Crear métodos como estudiar().

        Estudiante estudiante = new Estudiante("Pedro", 25, "Abogacia");
        
        estudiante.estudiar();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Clase Producto con nombre, precio y cantidad. Agregar constructor vacío y completo.

        Producto producto1 = new Producto();
        Producto producto2 = new Producto("Play 5", 660, 4);

        producto1.mostrarProducto();
        System.out.println();
        producto2.mostrarProducto();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Clase Empleado con sueldo base. Calcular sueldo final con un bono pasado por constructor.

        Empleado empleado = new Empleado(10000, 10.0);

        empleado.calcularSueldo();


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS HERENCIA Y POLIMORFISMO");
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

        //Crear una clase Persona con nombre y edad.
        //Crear una clase Estudiante que herede de Persona y agregue carrera.

        Es es = new Es("LTI", "Pedro", 34);

        es.mostrarPersona();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Clase Transporte con método mover(). 
        //Subclases Auto, Bicicleta que sobrescriben ese método.

        Bicicleta bici = new Bicicleta();
        Patineta patineta = new Patineta();

        bici.mover();
        patineta.mover();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Clase Animal → subclase Perro, con su propio sonido.

        Perro dogo = new Perro("Dogo", 4);
        dogo.sonido();
        dogo.mostrarPerro();

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Crear un array de Animal y guardar objetos de Perro, Gato, etc., e invocar el método hacerSonido().

        Animal a1 = new Animal("Gato");
        Animal a2 = new Perro("Bob", 3);
        a1.sonido();
        a2.sonido();




    }
}