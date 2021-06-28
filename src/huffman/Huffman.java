package huffman;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Huffman {
    public HashMap<String, Integer> getTablaFrecuencias(String mensaje){
        HashMap<String, Integer> tablaFrecuencia = new HashMap<>();
        for (int i=0; i < mensaje.length(); i++){
            String car = "" + mensaje.charAt(i);
            if (tablaFrecuencia.containsKey(car)) {
                tablaFrecuencia.put(car, tablaFrecuencia.get(car) + 1);
            }else{
                tablaFrecuencia.put(car,1);
            }

        }
        return tablaFrecuencia;
    }
    public ArrayList<Nodo> getListaNodos(HashMap<String, Integer> h){
        ArrayList<Nodo> lista = new ArrayList<>();
        h.forEach( (k,v) -> {
                        Nodo n = new Nodo(k,v);
                        lista.add(n);
                     }
                );
        return lista;
    }
    // REPETIR HASTA TENER 1 NODO EN LA LISTA
    //      tomar los 2 nodos con frecuencia menor ***
    //      crear nuevo nodo con la suma de frecuencias ***
    //      asignar los 2 nodos como hijos del  nuevo nodo ***
    //      agregar el nuevo nodo a la lista de nodos
    //      ordenar por frecuencia
    public Nodo getRaiz(ArrayList<Nodo> listaNodos){
        while (listaNodos.size() > 1){
            Nodo nodo0 = null, nodo1 = null;
            nodo0 = listaNodos.remove(0);
            nodo1 = listaNodos.remove(0);
            Nodo nodoNuevo = new Nodo(nodo0.getLetra()+nodo1.getLetra(),
                                     nodo0.getFrecuencia()+nodo1.getFrecuencia()
                                      );
            nodoNuevo.setIzq(nodo0);
            nodoNuevo.setDer(nodo1);
            listaNodos.add(nodoNuevo);
            Collections.sort(listaNodos);
            System.out.println("Nodo Nuevo" + nodoNuevo);
        }
        Nodo raiz = listaNodos.get(0);
        System.out.println("lista Nodos proceso:" + listaNodos);
        System.out.println("Raiz:" + raiz);
        return raiz;

    }




}
