package busquedas;

import java.util.ArrayList;

public class MainGenerica
{
    public static void main(String[] args) {
        ArrayList<Recipiente> recipientes = new ArrayList<>();
        recipientes.add(new Recipiente("fresa",1,1));
        recipientes.add(new Recipiente("melon",2,2));
        recipientes.add(new Recipiente("sandia",3,3));

        SearchGenerica<Recipiente> searchG = new SearchGenerica<>();
        int resultado = searchG.lineal(recipientes,
                new Recipiente("pina",8,10), false);
        System.out.println("Encontrado: " + resultado);

    }
}
