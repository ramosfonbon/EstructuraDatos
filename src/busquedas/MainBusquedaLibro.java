package busquedas;

import generica.Lapiz;
import generica.Libro;

import java.util.ArrayList;

public class MainBusquedaLibro {
    public static void main(String[] args) {

        Libro l1 = new Libro("Titulo 1", 111);
        Libro l2 = new Libro("Titulo 2", 112);
        Libro l3 = new Libro("Titulo 3", 113);
        Libro l4 = new Libro("Titulo 4", 114);
        Libro l5 = new Libro("Titulo 5", 115);
        Libro l6 = new Libro("Titulo 6", 116);
        Libro l7 = new Libro("Titulo 7", 117);

        Libro buscar = new Libro("Titulo 0", 111);

       // System.out.println("Resultado: " + buscar.compareTo(l3));
        ArrayList<Libro> listaLibros = new ArrayList<>();
        listaLibros.add(l1);
        listaLibros.add(l2);
        listaLibros.add(l3);
        listaLibros.add(l4);
        listaLibros.add(l5);
        listaLibros.add(l6);
        listaLibros.add(l7);
        System.out.println(listaLibros);
        SearchGenerica s = new SearchGenerica();
        System.out.println("posicion: " +
                            s.lineal(listaLibros,buscar,false));

        ArrayList<Lapiz> listaLapiz = new ArrayList<>();
        listaLapiz.add(new Lapiz("amarillo", 2));
        s.lineal(listaLapiz, new Lapiz("amarillo",2),
                false);



    }

}
