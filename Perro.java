public class Perro extends Animal{

    private String nombre;
    public Perro(String nombre, int edad){
        super(edad);
        this.nombre = nombre;

    }

    public void mostrarPerro(){
        System.out.println("nombre del perro: " + nombre + " / " + "edad del perro: " + edad);
    }

    @Override
    public void sonido(){
        System.out.println("Guau guau");
    }
    
}
