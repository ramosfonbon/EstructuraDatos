package ordenacion;

import java.util.*;
public class OrdenamientoInsercion {

  //  static final int DATOS = 100000;


    public int[] ordenarInsercion(int[] array){     
        int aux;
        for (int i = 1; i < array.length; i++) {
            aux = array[i];
            for (int j = i-1; j >=0 && array[j]>aux; j--) {
                array[j+1]=array[j];
                array[j]=aux;
            }
        }
        return array;
    }
}