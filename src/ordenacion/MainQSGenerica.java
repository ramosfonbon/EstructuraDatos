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

        Integer[] numeros = { 534,946,17,	749,566,
                552,304,732,230,374,
                850,584,199,33,225,
                159,437,809,183,383,
                681,294,611,771,269,
                561,902,508,720,830,
                395,326,761,783,614,
                606,278,892,129,882,
                945,80,46,522,302,
                669,70,706,268,999};

        QuicksortGenerica<Integer> qsi = new QuicksortGenerica<>();
        qsi.quickSort(numeros, 0, numeros.length-1);
        imprimir(numeros);
    }

    private static void imprimir(Recipiente[] r){
        for (Recipiente recipiente:r){
            System.out.println(recipiente);
        }
    }

    private static void imprimir(Integer[] r){
        for (Integer entero:r){
            System.out.println(entero);
        }
    }
}
