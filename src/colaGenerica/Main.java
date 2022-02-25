package colaGenerica;

public class Main {
    public static void main(String[] args) {
        Cola<String> stringCola = new Cola<>(5);

        stringCola.enqueue("uno");
        stringCola.enqueue("dos");
        stringCola.enqueue("tres");
        stringCola.enqueue("cuatro");
        stringCola.enqueue("cinco");

        imprimir(stringCola);

        Cola<Recipiente> recipienteCola = new Cola<>(10);

        recipienteCola.enqueue(new Recipiente("frijol",
                1,5));
        recipienteCola.enqueue(new Recipiente("maiz",
                1,8));
        recipienteCola.enqueue(new Recipiente("arroz",
                1,15));
        recipienteCola.enqueue(new Recipiente("lenteja",
                1,25));

        imprimirR(recipienteCola);
    }

    private static void imprimir(Cola<String> stringCola) {
        while (!stringCola.isEmpty()){
            System.out.println(stringCola.dequeue());
        }
    }

    private static void imprimirR(Cola<Recipiente> recipienteCola) {
        while (!recipienteCola.isEmpty()){
            System.out.println(recipienteCola.dequeue());
        }
    }


}
