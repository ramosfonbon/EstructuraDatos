package pilaGenerica;

public class Main {
    public static void main(String[] args) {
        Pila<String> stringPila = new Pila<>(5);
        stringPila.push("uno");
        stringPila.push("dos");
        stringPila.push("tres");
        stringPila.push("cuatro");
        stringPila.push("cinco");
        stringPila.push("seis");

       // imprimir(stringPila);
        System.out.println("--------");

        Pila<Recipiente> recipientePila = new Pila<>(5);
        recipientePila.push(new Recipiente("arroz",
                                1,1));
        recipientePila.push(new Recipiente("frijol",
                2,1));
        recipientePila.push(new Recipiente("garbanzo",
                3,1));
        recipientePila.push(new Recipiente("lenteja",
                4,1));
        recipientePila.push(new Recipiente("maiz",
                5,1));

        imprimir2(recipientePila);



    }

    private static void imprimir2(Pila<Recipiente> recipientePila) {
        while (!recipientePila.isEmpty()){
            Recipiente r = recipientePila.pop();
            System.out.println(r);
           // System.out.println(r.getContenido() + " : " +
           //                     r.getTamano());
        }
    }

    private static void imprimir(Pila<String> stringPila) {
        while (!stringPila.isEmpty()){
            System.out.println(stringPila.pop());
        }


    }


}
