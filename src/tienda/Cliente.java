package tienda;

public class Cliente {

    private String nombre;
    private int articulos;
    private String tipoPago;
    private String telefono;

    public Cliente(){}

    public Cliente(String nombre, int articulos, String tipoPago, String telefono) {
        this.nombre = nombre;
        this.articulos = articulos;
        this.tipoPago = tipoPago;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getArticulos() {
        return articulos;
    }

    public void setArticulos(int articulos) {
        this.articulos = articulos;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
