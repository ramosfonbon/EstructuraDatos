package ordenacion;

import ordenacion.Persona;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainOrdenaPersona {
    public static void main(String[] args) {
       Persona pA = new Persona("Aurora", 19,
       "Arriaga", 160f);
       Persona pB= new Persona("Luis", 18,
       "Tonala", 160f);
       Persona pC= new Persona("Carolina", 22,
                "Campeche", 160f);
       Persona pZ= new Persona("Zacarias", 25,
                "Tuxtla", 160f);



        ArrayList<Persona> ap = new ArrayList<>();
       ap.add(pA);
       ap.add(pB);
       ap.add(pC);
       ap.add(pZ);

       Ordenamiento<Persona> o = new Ordenamiento<>();

        System.out.println("Original: " + ap);
        System.out.println("   Orden: " + o.insercion(ap));

        //  System.out.println(pA.compareTo(pB));
        /*
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
        */

    }
}


