/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generica;
import java.util.ArrayList;

/**
 *
 * @author vramos
 */
public class Search <T extends Comparable<T>>{
    public int lineal(ArrayList<T> a, T b, boolean d){
        int pos = -1;
        int iter = 0;
        // compareTo
        // 0 : los elemenotos son iguales
        // > 0: el elemento es mayor
        // < 0: el elemento es menor
        for (int i = 0; i < a.size(); i++){
            if (b.compareTo(a.get(i)) == 0){
                pos = i;
            }
            if (d){
                iter++;
            }
        }
        if (d)
            System.out.println("Iter: " + iter);
        return pos;
    }

}
