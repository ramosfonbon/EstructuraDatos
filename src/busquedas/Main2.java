/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author vramos
 */
public class Main2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String a = "Mundo";
        String b = "Hola";
        System.out.println(" a == b " + (a == b));
        //   0 : iguales
        // > 0 : mayor
        // < 0 : menor
        System.out.println(" a == b " + (a.compareToIgnoreCase(b)));

     //   System.out.println(" a > b " + (a > b));
        System.out.println(" a > b " + (a.compareToIgnoreCase(b)));

        Integer n1 = 5; // wrapper
        Integer n2 = 8;
        System.out.println(" 5 == 8 " + (n1 == n2));
        System.out.println(" 5 < 8 " + (n1 < n2));



    }
}
