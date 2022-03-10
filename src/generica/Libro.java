package generica;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int paginas;
    private String isbn;
    private String autores;

    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
    }

    public Libro(String titulo, int paginas, String autores, String isbn) {
        this.titulo = titulo;
        this.paginas = paginas;
        this.autores = autores;
        this.isbn = isbn;
    }

    @Override
    public int compareTo(Libro libro){
        int resultado = this.titulo.compareTo(libro.titulo);
        if (resultado == 0){  // titulos iguales
            if (this.paginas == libro.paginas){
                return 0;
            }
            if (this.paginas > libro.paginas){
                return 11;
            } else{
                return -31;
            }
        }
        return resultado;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    @Override
    public String toString(){
        return this.titulo + ":" +
                this.paginas + ":" +
                this.isbn;
    }
}
