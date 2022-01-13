package pilas2;

public class Main {
    public static void main(String[] args) {
        PilaChar pila = new PilaChar(25);
        PilaChar pila2 = new PilaChar(25);

        pila.push('a');
        pila.push('z');
        pila.push('m');
        pila.push('b');
        while (!pila.isEmpty()){
            pila2.push(pila.pop());
        }

        while (!pila2.isEmpty()){
            System.out.println("pop2:" + pila2.pop());
        }

    }
}
