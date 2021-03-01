package generica;

import java.util.ArrayList;

public class MainBusqueda {
    public static void main(String[] args) {
        Borrador b1, b2, b3, b4, b5;
        b1 = new Borrador("lapiz","chico");
        b2 = new Borrador("tinta","grande");
        b3 = new Borrador("tinta","mediano");
        b4 = new Borrador("lapiz","grande");
        b5 = new Borrador("tinta","chico");

        Borrador buscar = new Borrador("aaaaa","mediano");

       // System.out.println(b1.compareTo(b2));

        ArrayList<Borrador> lista= new ArrayList<>();

        lista.add(b1);
        lista.add(b2);
        lista.add(b3);
        lista.add(b4);
        lista.add(b5);

        Search<Borrador> s = new Search<>();

        System.out.println("posicion:"+ s.lineal(lista,buscar,false));

    }
}


