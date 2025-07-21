package EjExamenes;

public class Matrices {
            public static void main(String[] args) {

                System.out.println();
                System.out.println();
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("EJERCICIOS EXAMEN MATRICES");
                System.out.println();
                System.out.println("---------------------------------");
                System.out.println();

                System.out.println();
                System.out.println();
                System.out.println("---------------------------------");
                System.out.println();
                System.out.println("EJEMPLO");
                System.out.println();
                System.out.println();


                    int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

                    for(int i = 0; i < matriz.length; i++){
                        for(int j = 0; j < matriz[i].length; j++){
                            System.out.print(matriz[i][j] + " ");
                        }
                        System.out.println();
                    }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 1");
        System.out.println();
        System.out.println();

        //calcular el promedio de los elementos de una matriz

        int[][] matrizPromedio = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int suma = 0;
        int cantidad = 0;

        for(int i = 0; i < matrizPromedio.length; i++){
            for(int j = 0; j < matrizPromedio[i].length; j++){
                suma += matriz[i][j];
                cantidad++;
            }
        }

        double promedio = suma / cantidad;

        System.out.println(promedio);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println();

        //Calcular el promedio de cada fila en una matriz 4x4.

        int[][] matrFP = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        for(int i = 0; i < matrFP.length; i++){
            int sumP = 0;
            for(int j = 0; j < matrFP[i].length; j++){
                sumP += matrFP[i][j];
            }

            double prom = (double) sumP / matrFP[i].length;
            System.out.println("Promedio de fila " + i + " = " + prom);
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 3");
        System.out.println();
        System.out.println();

        //Calcular el promedio de cada columna en una matriz 5x3.

        int [][] matrCP = {
            {1, 2, 3},
            {6, 7, 8},
            {9, 10 ,11},
            {12, 13, 14},
            {15, 16, 17}
        };

        int columna = matrCP[0].length;
        int fila = matrCP.length;

        for(int j = 0; j < columna; j++){
            int sum = 0;
            for(int i = 0; i < fila; i++){
                sum += matrCP[i][j];
            }

            double prom = (double) sum / fila;
            System.out.println("Promedio de la columna " + j + " = " + prom);
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 4");
        System.out.println();
        System.out.println();

        //Dada una matriz de temperaturas por día y hora, calcular el promedio diario (por fila).

        int [][] diaHora = {
            {23, 31, 24},
            {26, 26, 27},
            {32, 31, 29}
        };

        for(int i = 0; i < diaHora.length; i++){
            int sum = 0;
            for(int j = 0; j < diaHora[i].length; j++){
                sum += diaHora[i][j];
            }

            double prom = (double) sum / diaHora[i].length;
            System.out.println("El promedio de la temperatura del dia " + i + " = " + prom);
        }

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 5");
        System.out.println();
        System.out.println();

        //Calcular el promedio solo de los elementos pares de una matriz.

        int[][] pares = {
            {1, 2, 3, 4, 5, 6},
            {3, 4, 5, 6, 7, 8},
            {5, 6, 7, 8, 9, 10}
        };

        int s = 0;
        int c = 0;
        for(int i = 0; i < pares.length; i++){
            for(int j = 0; j < pares[i].length; j++){
                if (pares[i][j] %2 == 0) {
                    s += pares[i][j];
                    c++;
                }
            }
        }

        double p = (double) s / c;
        System.out.println(p);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 6");
        System.out.println();
        System.out.println();

        //Calcular el promedio solo de los elementos en la diagonal principal.

        int [][] diagonalP = {
            {3, 1, 6},
            {1213, 3, 89},
            {6, 312, 3}
        };

        int sum = 0;
        int cant = diagonalP.length;

        for(int i = 0; i < diagonalP.length; i++){
            sum += diagonalP[i][i];
        }

        double pr = (double) sum / cant;
        System.out.println(pr);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 7");
        System.out.println();
        System.out.println();

        //Calcular el promedio de la diagonal secundaria.

        int sumD =0;
        int cantD = diagonalP.length;
        for (int i = 0; i < cantD; i++){
            sumD += diagonalP[i][cantD - 1 - i];
        }

        double pD = (double) sumD / cantD;
        System.out.println(pD);

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 8");
        System.out.println();
        System.out.println();

        //

    }
}
