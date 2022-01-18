package colas;

public class Main

{
    public static void main(String[] args) {
        ColaString unifila = new ColaString(7);
        ColaString caja1 = new ColaString(7);
        ColaString caja2 = new ColaString(7);
        unifila.enqueue("Pepe");
        unifila.enqueue("Laura");
        unifila.enqueue("Miguel");
        unifila.enqueue("Lucia");
        unifila.enqueue("Edgar");
        unifila.enqueue("Lorena");
        unifila.enqueue("Diego");
        unifila.enqueue("Francisco");
        int cambio = -1;
        while (!unifila.isEmpty()) {
            if (cambio > 0){
                caja1.enqueue(unifila.dequeue());
            }else{
                caja2.enqueue(unifila.dequeue());
            }
            cambio = cambio *-1;
        }

        System.out.println("Caja1:");
        while (!caja1.isEmpty()){
            System.out.println(caja1.dequeue());
        }

        System.out.println("Caja2:");
        while (!caja2.isEmpty()){
            System.out.println(caja2.dequeue());
        }


    }
}
