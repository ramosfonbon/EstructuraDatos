package huffman;

public class Nodo implements Comparable<Nodo>{
    private String letra;
    private Integer frecuencia;
    private Nodo izq;
    private Nodo der;

    public Nodo (String letra, int frecuencia){
        this.letra = letra;
        this.frecuencia = frecuencia;
        izq = null;
        der = null;
    }

    @Override
    public int compareTo(Nodo f){
        return getFrecuencia().compareTo(f.getFrecuencia());
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public Integer getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(Integer frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Nodo getIzq() {
        return izq;
    }

    public void setIzq(Nodo izq) {
        this.izq = izq;
    }

    public Nodo getDer() {
        return der;
    }

    public void setDer(Nodo der) {
        this.der = der;
    }

    @Override
    public String toString(){
        return getLetra()+"="+getFrecuencia();
    }
}
