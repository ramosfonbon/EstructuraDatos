package ordenacion;

import java.util.ArrayList;

public class Sort <T extends Comparable<T> > {

    public ArrayList<T> insercion(ArrayList<T> array){
        T aux;
        for (int i = 1; i < array.size(); i++) {
            aux = array.get(i);
            for (int j = i-1; j >=0 &&
                    array.get(j).compareTo(aux) > 0 ; j--) {
                array.set(j+1, array.get(j));
                array.set(j, aux);

            }
        }
        return array;
    }
}

