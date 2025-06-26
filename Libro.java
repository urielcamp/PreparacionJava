public class Libro {
    private String titulo;
    private String autor;
    private int ano;

    public Libro(String titulo, String autor, int ano){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public void mostrarLibro(){
        System.out.println("Titulo: " + titulo + " Autor: " + autor + " Ano: " + ano);
    }
}
