public class Emple {
    protected int sueldo;
    protected int jornal;

    public Emple(int jornal){
        this.jornal = jornal;
        sueldo = 0;
    }

    public void calcularSueldo(){
        System.out.println("Se calculo sueldo");
    }

    public void mostrarSueldo(){
        System.out.println(sueldo);
    }
}
