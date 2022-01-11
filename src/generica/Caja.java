package generica;

public class Caja<T> {
    private T contenido;
    private int cantidad;

    public Caja() {

    }

    public Caja(T contenido, int cantidad) {
        this.contenido = contenido;
        this.cantidad = cantidad;
    }

    public T getContenido() {
        return contenido;
    }

    public void setContenido(T contenido) {
        this.contenido = contenido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String showType(){
        return contenido.getClass().getName();
    }

    @Override
    public String toString(){
        return contenido + ":" + cantidad;
    }
}
