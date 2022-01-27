package bodega;

public class Main {
    public static void main(String[] args) {
 /*
 Llegan los camiones con recipientes de frutas y verduras (3 tipos de frutas
 o verduras)
 Los recipientes se clasifican en el orden que llegan y se asignan a un estante.
    Si la fruta/verdura es FRESA  estante1
    si la fruta/verdura el recipiente es tipo 1 estante2
    si la fruta/verdura el recipiente es tipo 2,3 estante 3

 crear 5 recipientes con fruta/verdura

 crear camion (cola recipientes)
 crear estante1 (cola recipientes)
 crear estante2 (cola recipientes)
 crear estante3 (cola recipientes)

 while (recipientes en el camion)
    tomar recipiente <- camion
    si (fruta es FRESA)
        agregar estante1 <- recipiente
    sino
        si (tipo es 1)
            agregar estante2 <- recipiente
        sino
            agregar estante3 <- recipiente
 end while
 */
        Recipiente recipiente1 = new Recipiente("FRESA", 1, 10);
        Recipiente recipiente2 = new Recipiente("DURAZNO", 3, 20);
        Recipiente recipiente3 = new Recipiente("JICAMA", 2, 5);
        Recipiente recipiente4 = new Recipiente("MAMEY", 3, 15);
        Recipiente recipiente5 = new Recipiente("LECHUGA", 1, 5);

        ColaRecipiente camion = new ColaRecipiente(10);
        camion.enqueue(recipiente1);
        camion.enqueue(recipiente2);
        camion.enqueue(recipiente3);
        camion.enqueue(recipiente4);
        camion.enqueue(recipiente5);


        ColaRecipiente estante1 = new ColaRecipiente(10);
        ColaRecipiente estante2 = new ColaRecipiente(10);
        ColaRecipiente estante3 = new ColaRecipiente(10);

        while (!camion.isEmpty()) {
            Recipiente recipiente = camion.dequeue();
            if (recipiente.getContenido() == "FRESA") {
                estante1.enqueue(recipiente);
            } else {
                if (recipiente.getTamano() == 1) {
                    estante2.enqueue(recipiente);
                } else {
                    estante3.enqueue(recipiente);
                }
            }
        }

        imprimir("Camion", camion);
        imprimir("Estante1", estante1);
        imprimir("Estante2", estante2);
        imprimir("Estante3", estante3);
    }

    public static void imprimir(String etiqueta, ColaRecipiente cola){
        System.out.println(" --- " + etiqueta + " ---");
        while (!cola.isEmpty()){
            Recipiente r = cola.dequeue();
            System.out.println(r.getContenido() + " : " + r.getTamano());
        }
    }
}
