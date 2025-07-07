public class Animal {
    
    protected int edad;
    protected String especie;


    public Animal(String especie, int edad){
        this.especie = especie;
        this.edad = edad;
    }

    public Animal(String especie){
        this.especie = especie;
        edad = 0; 
    }

    public Animal(int edad){
        this.edad = edad;
        especie = "Desconocida";
    }



    public void mostrarAnimal(){
        System.out.println("Especie: " + especie + " / " + " Edad: " + edad + " Años");
    }

    public void sonido(){
        System.out.println("Sonido animal");
    }
}
