package HashMapExam;

public class Libro {
    private int id;
    private String titulo;
    private double autor;

    public Libro(int id, String titulo, double autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getAutor() {
        return autor;
    }

    public void setAutor(double autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor=" + autor +
                '}';
    }
}
