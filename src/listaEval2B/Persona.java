package listaEval2B;


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
    //Implementar
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;  //cast
        return  nombre.equals(persona.getNombre())    //  nombre == persona.getNombre()
                && estatura == persona.getEstatura();

    }

    // Implementar
    @Override
    public int compareTo(Persona p){
        int resultado = nombre.compareTo(p.getNombre());
        if (resultado != 0){
            return resultado;
        }
        if (estatura == p.getEstatura()){
            return 0;
        }
        if (estatura <= p.getEstatura()){
            return -1;
        } else{
            return  1;
        }



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
        return nombre + ":" + estatura;
    }
}
