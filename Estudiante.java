public class Estudiante {
    private String nombre;
    private int edad;
    private String carrera;

    public Estudiante(String nombre, int edad, String carrera){
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println(nombre + " esta estudiando la carrera " + carrera );
    }
}
