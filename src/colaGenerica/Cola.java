package colaGenerica;

import java.util.ArrayList;

public class Cola<T> {
    //private T data[]y;
    private ArrayList<T> data;
    private int capacidad;
    private int index;

    public Cola(int capacidad){
        data = new ArrayList<T>();
        index = 0;
        this.capacidad = capacidad;
    }

    public void enqueue(T dato){
        if (!isFull()) {
            data.add(dato);
        }
    }

    public T dequeue(){

        if (isEmpty()){
            return null;
        }else{
            return data.remove(0);
        }
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }

    public boolean isFull(){
        //return index == data.length;
        return data.size() == this.capacidad;
    }
}
