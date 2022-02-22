package arreglosArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
            //cadenas();
            clientes();

    }

    private static void clientes(){
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        listaClientes.add(new Cliente("Cliente 1", 1));
        listaClientes.add(new Cliente("Cliente 2", 2));
        listaClientes.add(new Cliente("Cliente 3", 3));
        listaClientes.add(new Cliente("Cliente 4", 4));

        imprimirCliente(listaClientes);

        listaClientes.add(2,new Cliente("Cliente agregado 2", 2));

        imprimirCliente(listaClientes);

        System.out.println("buscar: " + listaClientes
                .contains(new Cliente("Cliente 3", 3)));
        System.out.println("buscar: " + listaClientes
                .contains(new Cliente("Cliente agregado 2", 2)));
        Cliente c = new Cliente();


        System.out.println("igual:" +
                listaClientes.get(2).equals(
                        new Cliente("Cliente agregado 2", 2)));

    }

    private static void imprimirCliente(ArrayList<Cliente> listaClientes) {
        for (Cliente c:listaClientes){
            System.out.println(c.getNombre());
        }

    }

    private static void cadenas(){
        ArrayList<String> listaString = new ArrayList<>();
        listaString.add("Primera cadena");
        listaString.add("Segunda cadena");
        listaString.add("Tercera cadena");

        listaString.add(1, "agregado pos 1");
        listaString.add("insertado");

        imprimir(listaString);

        String borrado = listaString.remove(1);

        imprimir(listaString);
        System.out.println("Borrado: " + borrado);

        String reemplazado = listaString.set(1,borrado);

        imprimir(listaString);
        System.out.println("Reemplazado: " + reemplazado);

        System.out.println("----");
        System.out.println("buscar: " + listaString.contains("Tercera cadena"));
        System.out.println("buscar: " + listaString.contains("cadena"));
        System.out.println("isEmpty: " + listaString.isEmpty());
        listaString.clear();
        System.out.println("isEmpty: " + listaString.isEmpty());



    }

    private static void imprimir(ArrayList<String> lista){
        for (int i=0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
    }

}
