package compara;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean setEdad(int e){
        if (e == 0 || e < 0)
            return false;
        edad = e;
        return true;
    }

    public boolean setNombre(String n){
        if (n.equals("")){
            return false;
        }
        if (n.length() > 10){
            return false;
        }
        nombre = n;
        return true;
    }

    public int getEdad() {
        return edad;
    }
}
