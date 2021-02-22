/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparaciones;
import busquedas.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author vramos
 */
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Caja caja1 = new Caja(17,"fresa");
        Caja caja2 = new Caja(15,"Mango");
        Caja caja3 = new Caja(1,"Manzana");

        System.out.println(" Caja 1 ??? caja 2: " + caja1.compareTo(caja2));
        ArrayList<Caja> cajas= new ArrayList<>();
        cajas.add(caja1);
        cajas.add(caja2);
        cajas.add(caja3);
        System.out.println(cajas);
        System.out.println("Elementos ordenados");
        Collections.sort(cajas);
        System.out.println(cajas);



    }
}
