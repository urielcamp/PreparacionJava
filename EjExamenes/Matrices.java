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

        //Calcular el promedio de los elementos mayores que 10 en una matriz.

        int[][] m ={
            {23, 3, 553, 3},
            {24, 10, 21, 3},
            {21, 2, 34, 2},
            {213, 3, 4, 6}
        };

        int sAux = 0;
        int cAux = 0;
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[i].length; j++){
                if(m[i][j] > 10){
                    sAux += m[i][j];
                    cAux++;
                }
            }
        }

            double pAux = sAux / cAux;
            System.out.println("Promedio de la matriz = " + pAux);


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 9");
        System.out.println();
        System.out.println();

        //Verificar si el promedio de una fila es mayor al promedio de otra y mostrar cuál es mayor.

        int[][] arrM = {
            {3, 3, 3},
            {3, 3, 3},
            {6, 6, 6}
        };

        int filaA = 0;
        int filaB = 1;

        int sumaA = 0;
        for(int i = 0; i < arrM[filaA].length; i++){
            sumaA += arrM[filaA][i];
        }
        
        int sumaB = 0;
        for(int i = 0; i < arrM[filaB].length; i++){
            sumaB += arrM[filaB][i];
        }

        double promedioA = (double) sumaA / arrM[filaA].length;
        double promedioB = (double) sumaB / arrM[filaB].length;

        if (promedioA > promedioB) {
            System.out.println("La fila " + filaA + " tiene promedio mas alto que la fila " + filaB);
        }else if(promedioB > promedioA){
            System.out.println("La fila " + filaB + " tiene promedio mas alto que la fila " + filaA);
        }else{
            System.out.println("El promedio de las dos filas son iguales");
        }
    

        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 10");
        System.out.println();
        System.out.println();

        //Sumar dos matrices del mismo tamaño.

        int[][] mA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] mB = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int filas = mA.length;
        int columnas = mA[0].length;
        int[][] resultado = new int[filas][columnas];

        for(int i = 0; i < filas; i++){
            for(int j = 0; j < columnas; j++){
                resultado[i][j] = mA[i][j] + mB[i][j];
                System.out.print(resultado[i][j] + " ");
                
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 11");
        System.out.println();
        System.out.println();

        //Sumar dos matrices 4x4.

        int [][] a = {
            {100 , 200, 300, 400},
            {500, 600, 700, 800},
            {900 , 1000, 1100, 1200},
            {1300 , 1400, 1500, 1600}
        };

        int [][] b = {
            {10 , 20, 30, 40},
            {50 , 60, 70, 80},
            {90 , 100, 110, 120},
            {130 , 140, 150, 160}
        };

        int filasA = a.length;
        int columns = a[0].length;

        int [][] result = new int [filasA][columns];

        for(int i = 0; i < filasA; i++){
            for(int j = 0; j < columns; j++){
                result[i][j] = a[i][j] + b[i][j];
                System.out.print(result[i][j] +  " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 12");
        System.out.println();
        System.out.println();

        //Restar dos matrices 4x4.

        int[][] res = new int[filasA][columns];

        for(int i = 0; i < filasA; i++){
            for(int j = 0; j < columns; j++){
                res[i][j] = a[i][j] - b[i][j];
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 13");
        System.out.println();
        System.out.println();

        //Contar cuántos elementos de una matriz son mayores que 10.

        int[][] mz = {
            {1, 34, 2},
            {23, 4, 6},
            {31, 7, 65}
        };

        int cnt = 0;

        for(int i = 0; i < mz.length; i++){
            for(int j = 0; j< mz[i].length; j++){
                if (mz[i][j] > 10) {
                    cnt++;
                }
            }
        }

        System.out.println("La matriz tiene " + cnt + " valores mayores a 10");


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 14");
        System.out.println();
        System.out.println();

        //Reemplazar todos los números pares por 0 y los impares por 1.

        for(int i = 0; i < mz.length; i++){
            for(int j = 0; j < mz[i].length; j++){
                if (mz[i][j]%2 == 0) {
                    mz[i][j] = 0;
                }else{
                    mz[i][j] = 1;
                }

                System.out.print(mz[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 15");
        System.out.println();
        System.out.println();

        //Multiplicar cada elemento de una matriz por un número escalar (por ejemplo, 2).

        int [][] mza = {
            {12, 2, 4},
            {2, 5, 21},
            {10, 3, 7}
        };

        for(int i = 0; i < mza.length; i++){
            for(int j = 0; j < mza.length; j++){
                mza[i][j] = mza[i][j] * 2;
                System.out.print(mza[i][j] + " ");
            }

            System.out.println();
        }


        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 16");
        System.out.println();
        System.out.println();

        //Crear una matriz identidad de tamaño n (con 1 en la diagonal principal y 0 en el resto).

        int[][] mIdentidad = {
            {12, 2, 34},
            {23, 1, 43},
            {21, 12, 45}
        };

        for(int i = 0; i < mIdentidad.length; i++){
            for(int j = 0; j < mIdentidad[i].length; j++){
                mIdentidad[i][j] = 0;
                System.out.print(mIdentidad[i][j] + " ");

            }
            System.out.println();
        }

        System.out.println();

        for(int i = 0; i < mIdentidad.length; i++){
            mIdentidad[i][i] = 1;
        }

        for(int i = 0; i < mIdentidad.length; i++){
            for(int j = 0; j < mIdentidad[i].length; j++){
                System.out.print(mIdentidad[i][j] + " ");
            }
            System.out.println();
        }






























        }
    }
