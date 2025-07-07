public class EmpleadoFijo extends Emple{


    

    public EmpleadoFijo(int jornal){
        super(jornal);
        

    }

    @Override
    public void calcularSueldo(){
        sueldo = jornal * 30; //jornal por dias de trabajo
    }

    @Override
    public void mostrarSueldo(){
        System.out.println(sueldo);
    }
    
}
