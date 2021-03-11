package busquedas;

import generica.Libro;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComparaLibro {
    public static void main(String[] args) {
        Libro l1 = new Libro("La odisea",879,"Homero","12345");
        Libro l2 = new Libro("La iliada",379, "Homero","98765");
        Libro l3 = new Libro("La tumba",150,"Jose Agustin","abcd");
        Libro lb = new Libro("La iliada",150, "Homero","98765");
        LibroIsbnComparator LcI = new LibroIsbnComparator();
     //   System.out.println("Comp Isbn:" + LcI.compare(lb,l1 ));
        LibroPaginasComparator LcP = new LibroPaginasComparator();
     //   System.out.println("Comp Pag:" + LcP.compare(lb, l2));
        ArrayList<Libro> lLibro = new ArrayList<>();
        lLibro.add(l1);
        lLibro.add(l2);
        lLibro.add(l3);
        System.out.println("Lista Original:" + lLibro);
        Collections.sort(lLibro);
        System.out.println("Orden Natural:" + lLibro );
        Collections.sort(lLibro, LcP);
        System.out.println("Orden Paginas:" + lLibro );
        Collections.sort(lLibro, LcI);
        System.out.println("Orden ISBN:" + lLibro );
        SearchGenerica<Libro> sL = new SearchGenerica<>();
        System.out.println("busqueda Pag:" +
                sL.lineal(lLibro, lb, LcP, false));
        System.out.println("busqueda ISBN:" +
                sL.lineal(lLibro, l2, LcI, false));



    }

}


class LibroIsbnComparator implements Comparator<Libro> {
    @Override
    public int compare(Libro a, Libro b) {
        return a.getIsbn().compareTo(b.getIsbn());
    }
}

class LibroPaginasComparator implements Comparator<Libro>{
    @Override
    public int compare(Libro a, Libro b){
        return  a.getPaginas() < b.getPaginas() ? -99 :
                a.getPaginas() == b.getPaginas() ? 0 : 27;
    }
}
