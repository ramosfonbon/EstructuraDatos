package auxiliares;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //cadenas();
        recipientes();
    }

    private static void recipientes() {
        ArrayList<Recipiente> listaRecipiente = new ArrayList<>();
        listaRecipiente.add(new Recipiente("rosa",0,3));
        listaRecipiente.add(new Recipiente("clavel",1,3));
        listaRecipiente.add(new Recipiente("anturio",2,3));
        listaRecipiente.add(new Recipiente("loto",4,3));
       // imprimirRecipiente(listaRecipiente);
        listaRecipiente.add(3, new Recipiente("iris",5,3));
        imprimirRecipiente(listaRecipiente);
        System.out.println("--------");
        Recipiente borrado = listaRecipiente.remove(3);
        imprimirRecipiente(listaRecipiente);
        System.out.println("borrado: " + borrado.getContenido());
        System.out.println("--------");
        Recipiente buscar = new Recipiente("clavel",2,3);
        System.out.println("Buscar : " +
                listaRecipiente.contains(buscar));

    }

    private static void imprimirRecipiente(ArrayList<Recipiente> listaRecipiente) {
        for (Recipiente r:listaRecipiente){
            System.out.println("Contenido: " + r.getContenido());
        }
    }

    private static void cadenas(){
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("cadena 1"); // posicion 0
        listaString.add("cadena 2"); // 1
        listaString.add("cadena 3"); // 2
        listaString.add("cadena 4");
       // imprimir(listaString);
        listaString.add(2,"agregado posicion 2");
       // imprimir(listaString);
        imprimir(listaString);
        System.out.println("-----------");
        String borrado = listaString.remove(2);
        imprimir(listaString);
        System.out.println("elemento borrado: " + borrado);

        String reemplazado = listaString.set(2,borrado);
        imprimir(listaString);
        System.out.println("elemento reemplazado: " + reemplazado);
        System.out.println("--------");
        imprimir(listaString);
        System.out.println(" buscar : " +
                listaString.contains("cadena 4"));
        System.out.println("isEmpty: " + listaString.isEmpty());
        listaString.clear();
        System.out.println("isEmpty: " + listaString.isEmpty());


    }

    private static void imprimir(ArrayList<String> listaString) {
        for (int i=0; i < listaString.size(); i++){
            System.out.println(listaString.get(i));
        }
    }


}
