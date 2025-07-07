public class Es extends Persona {

    private String carrera;
    public Es(String carrera, String nombre, int edad){
        super(nombre, edad);
        this.carrera = carrera;
    }
    
    @Override
    public void mostrarPersona(){
        System.out.println(nombre + " " + edad + " " + carrera);
    }
}
