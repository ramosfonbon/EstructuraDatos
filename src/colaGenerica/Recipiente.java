package colaGenerica;

import java.util.Objects;

public class Recipiente implements Comparable<Recipiente>{
    private String contenido;
    private int tamano;
    private int peso;

    @Override
    public int compareTo(Recipiente o) {
        return this.getTamano() - o.getTamano();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipiente that = (Recipiente) o; //cast
        return getTamano() == that.getTamano() &&
                Objects.equals(getContenido(), that.getContenido());
    }

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


    @Override
    public String toString() {
        return "Recipiente{" +
                "contenido='" + contenido + '\'' +
                ", tamano=" + tamano +
                ", peso=" + peso +
                '}';
    }
}
