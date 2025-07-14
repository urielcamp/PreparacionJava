public class Estudiantil {
    private String nombre;
    private String carrera;
    private int anioIngreso;

    public Estudiantil(String nombre, String carrera){
        this.nombre = nombre;
        this.carrera = carrera;
        anioIngreso = 0;
    }

    public Estudiantil(String nombre, String carrera, int anioIngreso){
        this.nombre  = nombre;
        this.carrera = carrera;
        this.anioIngreso = anioIngreso;
    }

    public Estudiantil(){
        nombre = "Nombre desconocido";
        carrera = "Carrera desconocida";
        anioIngreso = 0;
    }

    public String getNombre(){
        return nombre;
    }

    public String getCarrera(){
        return carrera;
    }

    public int getAnioIngreso(){
        return anioIngreso;
    }

    public void mostrarEst(){
        System.out.println("Nombre: " + getNombre() + ", Carrera: " + getCarrera() + ", anio ingreso: " + getAnioIngreso());
    }


}
