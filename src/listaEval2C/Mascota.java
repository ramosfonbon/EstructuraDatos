package listaEval2C;


import org.hamcrest.core.StringContains;

public class Mascota implements Comparable<Mascota> {
    private String nombre;
    private int edad;
    private String tipo;     // perro, gato, hamster etc.
    private float peso;

    //Implementar
    @Override
    public boolean equals(Object o) {
return false;
    }

    // Implementar
    @Override
    public int compareTo(Mascota m){
        return 0;
    }


    @Override
    public String toString(){
        return nombre + ":" + tipo;
    }
}
