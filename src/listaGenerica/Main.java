package listaGenerica;

public class Main {
    public static void main(String[] args) {
        ListaSimple<String> stringListaSimple = new ListaSimple<>();
        stringListaSimple.add("Primero");
        stringListaSimple.add("segundo");
        stringListaSimple.add("tercero");

        System.out.println(stringListaSimple.get(0));
        System.out.println(stringListaSimple.get(1));
        System.out.println(stringListaSimple.get(2));

        ListaSimple<Recipiente> recipienteListaSimple = new ListaSimple<>();
        recipienteListaSimple.add(new Recipiente("arroz",5,6));
        recipienteListaSimple.add(new Recipiente("frijol",7,6));
        recipienteListaSimple.add(new Recipiente("garbanzo",9,6));

        System.out.println(recipienteListaSimple.get(2).getContenido());
        System.out.println(recipienteListaSimple.get(1));
        System.out.println(recipienteListaSimple.get(0));

    }
}
