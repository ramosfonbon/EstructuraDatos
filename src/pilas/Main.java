package pilas;

public class Main {
    public static void main(String[] args) {
        PilaChar pila1 = new PilaChar(10);
        PilaChar pila2 = new PilaChar(10);

        pila1.push('z');
        pila1.push('m');
        pila1.push('a');
        pila1.push('c');
        pila1.push('w');
        pila1.push('k');
        pila1.push('c');
        pila1.push('w');
        pila1.push('k');

        while (!pila1.isEmpty()){
           // System.out.println("pop:" + pila1.pop());
            pila2.push(pila1.pop());
        }
        while (!pila1.isEmpty()) {
            System.out.println("pop1:" + pila1.pop());
        }
        while (!pila2.isEmpty()) {
            System.out.println("pop2:" + pila2.pop());
        }
    }
}
