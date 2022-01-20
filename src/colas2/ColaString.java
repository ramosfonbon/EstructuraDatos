package colas2;

public class ColaString {

    private String data[];
    private int back;
    public ColaString(int capacidad ){
        data = new String[capacidad];
        back = 0;
    }
    public void enqueue (String dato){
        if (!isFull()){
            data[back] = dato;
            back++;
        }
    }
    public String dequeue(){
        if (isEmpty()){
            return null;
        }else {
            String temporal = data[0];
            for (int posicion=0; posicion < back-1; posicion++){
                data[posicion] = data[posicion+1];
            }
            back--;
            return temporal;
        }
    }
    public boolean isEmpty(){
        return back == 0;
    }
    public boolean isFull(){
        return back == data.length;
    }

}
