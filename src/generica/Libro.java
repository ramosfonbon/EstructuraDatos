package generica;

public class Libro implements Comparable<Libro>{
    private String titulo;
    private int paginas;

    public Libro(String titulo, int paginas) {
        this.titulo = titulo;
        this.paginas = paginas;
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

    @Override
    public String toString(){
        return this.titulo + ":" + this.paginas;
    }
}
