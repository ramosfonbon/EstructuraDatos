package busquedas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainComparaPersona {
    public static void main(String[] args) {
       Persona pA = new Persona("Aurora", 19,
               "ZArriaga", 160f);
       Persona pB= new Persona("Luis", 18,
               "Tonala", 160f);
        Persona pC= new Persona("Zacarias", 25,
                "Tuxtla", 160f);

       ArrayList<Persona> ap = new ArrayList<>();
       ap.add(pA);
       ap.add(pB);
       ap.add(pC);
      //  System.out.println(pA.compareTo(pB));
        PersonaCiudadComparator pCC = new PersonaCiudadComparator();
        int r = pCC.compare(pA, pB);
        System.out.println("Comp Ciudad:" + r);

        PersonaEdadComparator pCE = new PersonaEdadComparator();
        r = pCE.compare(pA, pB);
        System.out.println("Comp Edad:" + r);

        System.out.println("Lista Original:" + ap );
        Collections.sort(ap,pCC);
        System.out.println("Orden Ciudad:" + ap);
        Collections.sort(ap, pCE);
        System.out.println("Orden Edad:" + ap);
    }
}

class PersonaCiudadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona a, Persona b){
        return a.getCiudad().compareTo(b.getCiudad());
    }
}

class PersonaEdadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona a, Persona b){
        int resultado = 0;
        if (a.getEdad() == b.getEdad()){
            return 0;
        }
        if (a.getEdad() < b.getEdad()){
            return -9;
        } else {
            return 5;
        }


    }
}
