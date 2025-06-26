public class Auto{
    private String marca;
    private int ano;

    public Auto(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public Auto(String marca){
        this.marca = marca;
        ano = 0;
    }

    public Auto(int ano){
        this.ano = ano;
        marca = "Desconocida";
    }

    public void mostrarAuto(){
        System.out.println("Marca: " + marca + " / " + " Año: " + ano);
    }
}