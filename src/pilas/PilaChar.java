package pilas;
public class PilaChar {
    private char pila[];
    private int tope;  //top
    public PilaChar(int capacidad){
        pila = new char[capacidad];
        tope = -1;
    }
    public void push(char i){
        if (tope+1 < pila.length){
            pila[++tope] = i;
        }
    }
    public char pop(){
        if (!isEmpty()) {
            return pila[tope--];
        } else {
            return 0;
        }
    }
    public boolean isEmpty(){
        return tope == -1;
    }
}
