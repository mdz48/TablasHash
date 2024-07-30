public class Libro {
    private String autor;
    private String titulo;

    public Libro(String autor, String titulo) {
        this.autor = autor;
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Autor: " + autor + ", Título: " + titulo;
    }
}
