public class Empleado {
    //Clase Empleado con sueldo base. Calcular sueldo final con un bono pasado por constructor.

    protected int sueldoBase;
    protected double sueldoFinal;

    public Empleado(int sueldoBase, double bono){
        this.sueldoBase = sueldoBase;
        bono = sueldoBase * (bono / 100);
        sueldoFinal = sueldoBase + bono;
    }

    public void calcularSueldo(){
        System.out.println("El sueldo es:" + sueldoFinal);
    }
}
