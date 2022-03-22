package ordenacion;

public class MainQSGenerica {
    public static void main(String[] args) {
        Recipiente[] recipientes = new Recipiente[7];
        recipientes[0] = new Recipiente("Melon", 6, 4);
        recipientes[1] = new Recipiente("sandia", 1, 0);
        recipientes[2] = new Recipiente("pera", 4, 3);
        recipientes[3] = new Recipiente("manzana", 7, 8);
        recipientes[4] = new Recipiente("piña", 10, 6);
        recipientes[5] = new Recipiente("nanchi", 3, 4);
        recipientes[6] = new Recipiente("caspirol", 5, 2);

        QuicksortGenerica<Recipiente> qsg = new QuicksortGenerica<>();
        qsg.quickSort(recipientes, 0, recipientes.length-1);
        imprimir(recipientes);
    }

    private static void imprimir(Recipiente[] r){
        for (Recipiente recipiente:r){
            System.out.println(recipiente);
        }
    }
}
