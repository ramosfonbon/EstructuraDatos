package generica;

public class Borrador {
    String tipo;
    String tamano;

    public Borrador(String tipo, String tamano) {
        this.tipo = tipo;
        this.tamano = tamano;
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
