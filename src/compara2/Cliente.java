package compara2;

public class Cliente implements Comparable<Cliente> {

    private String nombre;
    private int articulos;
    private String tipoPago;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    @Override
    public int compareTo(Cliente o) {
/*        if (this.getArticulos() > o.getArticulos()) {
            return 1;
        } else if(this.getArticulos() < o.getArticulos()){
            return -1;
        }else{
            return 0;
        }
*/
        return this.getArticulos() - o.getArticulos();


    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;  //cast
        return getArticulos() == cliente.getArticulos()
                && getNombre().equals(cliente.getNombre());
    }


    public Cliente(String nombre, int articulos, String tipoPago, String telefono) {
        this.nombre = nombre;
        this.articulos = articulos;
        this.tipoPago = tipoPago;
        this.telefono = telefono;
    }

    public Cliente(String nombre, int articulos) {
        this.nombre = nombre;
        this.articulos = articulos;
    }

    public void setDireccion(String direccion) {
        if (direccion != "") {
            this.direccion = "S/D";
        } else {
            this.direccion = direccion;
        }
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