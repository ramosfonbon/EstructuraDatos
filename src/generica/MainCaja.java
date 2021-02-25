package generica;

import java.util.ArrayList;

public class MainCaja {
    public static void main(String[] args) {
        Caja<Libro> cajaLibro = new Caja<>();
        Caja<Lapiz> cajaLapiz = new Caja<>();
        ArrayList<Caja> contenedor = new ArrayList<>();

        Lapiz lapiz = new Lapiz("rojo",2);
        Libro libro = new Libro("Asi hablo Zaratustra", 525);

        cajaLibro.setContenido(libro);
        cajaLibro.setCantidad(10);

        cajaLapiz.setContenido(lapiz);
        cajaLapiz.setCantidad(200);

        System.out.println(cajaLibro.showType());
        System.out.println(cajaLapiz.showType());

        System.out.println(cajaLapiz.getContenido().getColor());
        System.out.println(cajaLibro.getContenido().getTitulo());

        contenedor.add(cajaLapiz);
        contenedor.add(cajaLapiz);






    }
}
