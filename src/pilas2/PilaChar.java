package pilas2;

public class PilaChar {
    private char pila[];
    private int tope; // top

    public PilaChar(int capacidad){
        pila = new char[capacidad];
        tope = -1;
    }
    public void push(char c){
        if (tope+1 < pila.length ) {
            pila[++tope] = c;
        }
    }
    public char pop(){
        if (tope == -1){
            return 0;
        } else {
            return pila[tope--];
        }
    }
    public boolean isEmpty(){
        return tope == -1;
    }
}
