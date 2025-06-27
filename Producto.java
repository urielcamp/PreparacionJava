public class Producto {
    private String nombre;
    private int precio;
    private int stock;

    public Producto(){
        nombre = "Desconocido";
        precio = 0;
        stock = 0;
    }

    public Producto(String nombre, int precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public void mostrarProducto(){
        System.out.println(nombre + " / " + precio + " / " + stock);
    }


}
