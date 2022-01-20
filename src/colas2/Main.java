package colas2;

public class Main {

    public static void main(String[] args) {
        ColaString fila = new ColaString(15);
        ColaString caja1 = new ColaString(15);
        ColaString caja2 = new ColaString(15);

        fila.enqueue("Raul");
        fila.enqueue("Laura");
        fila.enqueue("Luis");
        fila.enqueue("Raquel");
        fila.enqueue("Mario");
        fila.enqueue("Jose");
        fila.enqueue("Rocio");
        fila.enqueue("Josefina");
        fila.enqueue("Alberto");
        fila.enqueue("Paulina");
        int valor = -1;
        while (!fila.isEmpty()) {
            if (valor < 0){
                caja1.enqueue(fila.dequeue());
            } else {
                caja2.enqueue(fila.dequeue());
            }
            valor = valor * -1;    // valor*= -1;
        }
        while (!caja1.isEmpty()){
            System.out.println("caja1:" + caja1.dequeue());
        }
        while (!caja2.isEmpty()){
            System.out.println("caja2:" + caja2.dequeue());
        }


    }
}
