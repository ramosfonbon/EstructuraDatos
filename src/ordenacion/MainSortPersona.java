package ordenacion;

import java.util.ArrayList;

public class MainSortPersona {

    public static void main (String[] args){

        Persona a1 = new Persona("Abel", 20, "Arriaga", 170);
        Persona a2 = new Persona("Hortensia", 25, "Zacatecas", 165);
        Persona a3 = new Persona("Mario", 22, "Morelos", 173);
        Persona a4 = new Persona("Elena", 21, "Puebla", 167);
        Persona a5 = new Persona("Elena", 21, "Aguascalientes", 167);

        ArrayList<Persona> ap = new ArrayList<>();
        ap.add(a1);
        ap.add(a2);
        ap.add(a3);
        ap.add(a4);
        ap.add(a5);

        Sort<Persona> s = new Sort<>();
        System.out.println("Origal  : " + ap);
        System.out.println("Ordenada: " + s.insercion(ap));

    }

}
