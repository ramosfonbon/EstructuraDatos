package generica;

import java.util.ArrayList;

public class MainCaja {
    public static void main(String[] args) {
        Caja<Libro> cajaLibro = new Caja<>();
        Caja<Lapiz> cajaLapiz = new Caja<>();
        Caja<Borrador> cajaBorrador = new Caja<>();

        ArrayList<Caja> contenedor = new ArrayList<>();

        Lapiz lapiz = new Lapiz("rojo",2);
        Libro libro = new Libro("Asi hablo Zaratustra", 525);
        Borrador borrador = new Borrador("tinta","pequeño");

        cajaLibro.setContenido(libro);
        cajaLibro.setCantidad(10);

        cajaLapiz.setContenido(lapiz);
        cajaLapiz.setCantidad(200);

        cajaBorrador.setContenido(borrador);
        cajaBorrador.setCantidad(100);

        System.out.println(cajaLibro.showType());
        System.out.println(cajaLapiz.showType());
        System.out.println(cajaBorrador.showType());


        System.out.println(cajaLapiz.getContenido().getColor());
        System.out.println(cajaLibro.getContenido().getTitulo());

        System.out.println(cajaBorrador.getContenido().tipo);
        System.out.println(cajaBorrador.getContenido().tamano);



        contenedor.add(cajaLapiz);
        contenedor.add(cajaLibro);
        contenedor.add(cajaBorrador);

        System.out.println("Contenedor: " + contenedor);






    }
}
