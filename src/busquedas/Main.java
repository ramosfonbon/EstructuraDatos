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
public class Main {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*
                                534,946,17,	749,566,
                        552,304,732,230,374,
                        850,584,199,33,225,
                        159,437,809,183,383,
                        681,294,611,771,269,
                        561,902,508,720,830,
                        395,326,761,783,614,
                        606,278,892,129,882,
                        945,80,46,522,302,
                        669,70,706,268,999

         */


        ArrayList<Integer> oList = new ArrayList<Integer>
                (Arrays.asList(
                        534,946,17,	749,566,
                        552,304,732,230,374,
                        850,584,199,33,225,
                        159,437,809,183,383,
                        681,294,611,771,269,
                        561,902,508,720,830,
                        395,326,761,783,614,
                        606,278,892,129,882,
                        945,80,46,522,302,
                        669,70,706,268,999
                ));


        Search s = new Search();
        System.out.println("Lista original");
        System.out.println(oList);
        Collections.sort(oList);
        System.out.println("Lista ordenada");
        System.out.println(oList);
      //  System.out.println("Encontrado: " + s.lineal(oList,
      //                      new Integer(732), true));
        System.out.println("Binaria: " +
                s.binaria(oList, new Integer(225), true));

    }
}
