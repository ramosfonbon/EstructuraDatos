package huffman;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String mensaje = " El oso polar nada en el mar congelado";
        Huffman h = new Huffman();
        HashMap<String, Integer> tabla = new HashMap<>();
        tabla = h.getTablaFrecuencias(mensaje);
        System.out.println("T Frec:" + tabla);
        ArrayList<Nodo> lista = new ArrayList<>();
        lista = h.getListaNodos(tabla);
        Collections.sort(lista);
        System.out.println("L nodo:" + lista);
        Nodo raiz = h.getRaiz(lista);
        System.out.println("R:" + raiz);
    }
}
