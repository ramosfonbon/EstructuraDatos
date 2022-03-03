package lista;

public class Main {
    public static void main(String[] args) {
        ListaSimple<String> stringListaSimple = new ListaSimple<>();
        stringListaSimple.add("primero");
        stringListaSimple.add("segundo");

        System.out.println(stringListaSimple.get(0));
        System.out.println(stringListaSimple.get(1));
        System.out.println(stringListaSimple.get(-1));
        System.out.println(stringListaSimple.get(5));

        ListaSimple<Recipiente> recipientes = new ListaSimple<>();
        recipientes.add(new Recipiente("arroz",
                1,1));
        recipientes.add(new Recipiente("frijol",
                2,1));
        recipientes.add(new Recipiente("garbanzo",
                3,1));
        recipientes.add(new Recipiente("lenteja",
                4,1));
        recipientes.add(new Recipiente("maiz",
                5,1));
        imprimir(recipientes);

    }

    private static void imprimir(ListaSimple<Recipiente> recipientes) {
        for (int i = 0; i < recipientes.size(); i++){
            System.out.println(recipientes.get(i));
        }

    }
}
