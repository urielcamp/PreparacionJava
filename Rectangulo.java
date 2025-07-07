public class Rectangulo extends Figura{
    private int lado;
    private int ancho;
    private int area;

    public Rectangulo(int lado, int ancho){
        this.lado = lado;
        this.ancho = ancho;
        area = 0;
    }

    @Override
    public void calcularArea(){
        area = lado * ancho;
    }

    @Override
    public void mostrarFigura(){
        System.out.println("Area rectangulo: " + area);
    }
}
