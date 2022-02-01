package ev1B;



public class ColaRecipiente {
    private Recipiente data[];
    private int back;
    public ColaRecipiente(int capacidad ){
        data = new Recipiente[capacidad];
        back = 0;
    }
    public void enqueue (Recipiente dato){
        if (!isFull()){
            data[back] = dato;
            back++;
        }
    }
    public Recipiente dequeue(){
        if (isEmpty()){
            return null;
        }else {
            Recipiente temporal = data[0];
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
