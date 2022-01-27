package bodega;

public class Recipiente {
    private String contenido;
    private int tamano;
    private int peso;

    public Recipiente(String contenido, int tamano, int peso) {
        this.contenido = contenido;
        this.tamano = tamano;
        this.peso = peso;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
}
