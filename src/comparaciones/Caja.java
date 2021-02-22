package comparaciones;

public class Caja implements Comparable<Caja>{
    private int peso;
    private String fruta;

    public Caja(int peso, String fruta) {
        this.peso = peso;
        this.fruta = fruta;
    }

    @Override
    public int compareTo(Caja c){
        int resultado = 0;
        if (this.peso == c.peso){
            return 0;    // cajas iguales
        } else {
            if (this.peso < c.peso){
                return -1;
            } else {
                return 1;
            }
        }
    }


    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getFruta() {
        return fruta;
    }

    public void setFruta(String fruta) {
        this.fruta = fruta;
    }

    @Override
    public String toString(){
        return "P:" + this.peso + " F:" + this.fruta;
    }
}
