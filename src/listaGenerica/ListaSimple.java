package listaGenerica;

public class ListaSimple<T> {

    private Node<T> head; // apunta a la cabeza de la lista
    private int contador;

    public ListaSimple(){
        head = new Node<>(null);
        contador = 0;
    }

    public void add(T data){
        Node<T> temp = new Node<>(data);
        Node<T> actual = head; //pociciona en la cabeza
        while (actual.getNext() != null){
            actual = actual.getNext();
        }
        actual.setNext(temp);
        contador++;
    }

    public T get(int posicion){
        if (posicion < 0){
            return null;
        }
        if (head.getNext() == null){
            return null;
        }

        Node<T> actual = head.getNext();
        for (int i=0; i < posicion; i++){
            if (actual.getNext() == null){
                return null;
            }
            actual = actual.getNext();
        }
        return actual.getData();
    }





    private class Node<T>{
        private T data;
        private Node next;

        public Node(T data){
            next = null;
            this.data = data;
        }

        public T getData(){
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
