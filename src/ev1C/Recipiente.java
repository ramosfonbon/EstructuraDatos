package ev1C;

public class Recipiente {
    private String contenido;
    private int tamano;
    private int caducidad;

    public Recipiente(String contenido, int tamano, int caducidad) {
        this.contenido = contenido;
        this.tamano = tamano;
        this.caducidad = caducidad;
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

    public int getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(int caducidad) {
        this.caducidad = caducidad;
    }
}
