public class Cuadrado extends Figura{
    private int lado;
    private int area;

    public Cuadrado(int lado){
        this.lado = lado;
        area = 0;
    }

    @Override
    public void calcularArea(){
        area = lado * lado;
    }

    @Override
    public void mostrarFigura(){
        System.out.println("Area cuadrado: " + area);
    }

}
