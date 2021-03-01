package generica;

public class Borrador implements Comparable<Borrador>{
    String tipo;
    String tamano;

    public Borrador(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
    }

    @Override
    public int compareTo(Borrador b){
        int resultado = this.tipo.compareTo(b.tipo);
        if (resultado == 0){   // tipos son iguales
            return this.tamano.compareTo(b.tamano);
        }
        return resultado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString(){
        return tipo + ":" + tamano;
    }
}
