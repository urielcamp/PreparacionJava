package StringssChar;
public class Figuras {
    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJERCICIOS FIGURAS");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();


        System.out.println("EJER 1");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Triángulo recto de # con n filas.

        int n = 6;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j<= i; j++){
                System.out.print("#");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println("EJER 2");
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();

        //Triángulo invertido de *.

        for(int i = n; i >= 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
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

        //Triángulo derecho alineado con #.

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - 1; j++){
                System.out.print(" ");
            } 
            
            for(int j = 1; j <= i; j++){
                System.out.print("#");
            }
            System.out.println();
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

        //Pirámide con * (con espacios a los lados).

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(" ");
            }
            
            System.out.println();
        }












    }
}
