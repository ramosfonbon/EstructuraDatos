package ordenacion;

// Ejemplo de implementacion y uso
// de la interfase Comparator
//


public class Persona implements Comparable<Persona> {
    private String nombre;
    private int edad;
    private String ciudad;
    private float estatura;

    public Persona(String nombre, int edad, String ciudad, float estatura) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        this.estatura = estatura;
    }

    @Override
    public int compareTo(Persona p){
        int resultado = this.nombre.compareTo(p.nombre);
        if (resultado == 0){
            return this.ciudad.compareTo(p.ciudad);
        }
        return resultado;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString(){
        return nombre + ":" + ciudad;
    }
}
