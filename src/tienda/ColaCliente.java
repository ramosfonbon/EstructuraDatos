package tienda;

public class ColaCliente {

    private Cliente data[];
    private int back;
    public ColaCliente(int capacidad ){
        data = new Cliente[capacidad];
        back = 0;
    }
    public void enqueue (Cliente dato){
        if (!isFull()){
            data[back] = dato;
            back++;
        }
    }
    public Cliente dequeue(){
        if (isEmpty()){
            return null;
        }else {
            Cliente temporal = data[0];
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
