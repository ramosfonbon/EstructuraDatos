/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedas;
import java.util.ArrayList;

/**
 *
 * @author vramos
 */
public class Search {
    public int lineal(ArrayList<Integer> a, Integer b, boolean d){
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
    
    public int binaria(ArrayList<Integer> a, Integer b, boolean d){
        int pos = -1;
        int tam = (a.size()-1)/2;
        int inicio=0, fin = a.size()-1;
        int centro = tam;
        
      while (inicio<=fin){
        centro = inicio + (fin - inicio) / 2;  
        if (d){
            System.out.println("inicio:" + inicio + " fin:" + fin + " centro:" + centro + " tam:"+tam);
        }
        if (b.compareTo(a.get(centro)) == 0){ // El elemento
            pos = centro;
            // se encuentra
        }
        // compareTo   regresa 0 si los elementos son iguales
        //             regresa valor positivo si el elemento es mayor
        //             regresa valor negativo si el elemento es menor
        if (b.compareTo(a.get(centro)) > 0){  // b es mayor a centro Derecha
            inicio = centro +1;
        }
        else
        {
            fin = centro - 1;
                                            // izquierda
        }
        tam /= 2;
        
      }
        
        return pos;
    }
    
    
}
