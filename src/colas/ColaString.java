package colas;

public class ColaString {
    private String data[];
    private int index;

    public ColaString(int capacidad){
        data = new String[capacidad];
        index = 0;
    }

    public void enqueue(String dato){
        if (!isFull()) {
            data[index] = dato;
            index++;
        }
    }

    public String dequeue(){

        if (isEmpty()){
            return null;
        }else{
            String respuesta = data[0];
            // mover los valores hacia delante
            for (int posicion = 0; posicion < index-1; posicion++){
                data[posicion] = data[posicion+1];
            }
            index--;
            return respuesta;
        }
    }

    public boolean isEmpty(){
        return index == 0;
    }

    public boolean isFull(){
        return index == data.length;
    }
}
