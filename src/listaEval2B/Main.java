package listaEval2B;

import listaEval2B.ListaSimple;


public class Main {
    public static void main(String[] args) {
        ListaSimple<Persona> personas = new ListaSimple<>();
        Persona per1 = new Persona("AAA",10,"AAA",10f);
        Persona per2 = new Persona("BBB",10,"BBB",11f);
        Persona per3 = new Persona("CCC",10,"AAA",12f);
        Persona per4 = new Persona("DDD",10,"AAA",13f);
        Persona per5 = new Persona("EEE",10,"AAA",14f);
        Persona per6 = new Persona("FFF",10,"AAA",15f);
        Persona per7 = new Persona("GGG",10,"AAA",16f);
        Persona per8 = new Persona("HHH",10,"AAA",17f);
        Persona per9 = new Persona("III",10,"AAA",18f);
        Persona per10 = new Persona("JJJ",10,"AAA",11f);

        personas.add(per1);
        personas.add(per2);
        personas.add(per3);
        personas.add(per4);
        personas.add(per5);
        personas.add(per6);
        personas.add(per7);
        personas.add(per8);
        personas.add(per9);
        personas.add(per10);



        System.out.println(personas.contains(per3));

        System.out.println(per7.compareTo(per8));



        // agregar 10 personas a la lista

        // tomar la persona8 y ejecutar la busqueda, imprimir ls posicion en que se encontro
        // ej: personas.contains(persona8)

        // comparar la persona1 y la persona5, imprimir el resultado
        // ej: persona1.compareTo(persona5)

        imprimir(personas);

    }

    private static void imprimir(ListaSimple<Persona> personas) {


    }
}
