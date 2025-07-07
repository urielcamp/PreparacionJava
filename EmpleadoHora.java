public class EmpleadoHora extends Emple{
    private int horaTrabajo;
    
    public EmpleadoHora(int jornal, int horaTrabajo){
        super(jornal);
        this.horaTrabajo = horaTrabajo;
    }


    @Override
    public void calcularSueldo(){
        jornal = jornal /8;
        sueldo = jornal * horaTrabajo;
    }

    @Override 
    public void mostrarSueldo(){
        System.out.println(sueldo);
    }
}
