package compara;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/*

JUnit
XUnit

Clase persona tiene nombre y edad

getEdad regresa la edad, no se puede emodificar
getNombre regesa el nombre, no se puede modificar

edades no pueden ser 0 o negativas
nombre no puede estar vacio

 */
public class PersonaTest {

    private Persona persona;

    @Before
    public void setUp() throws Exception {
        persona = new Persona("Jose", 23);
    }

    @org.junit.Test
    public void getNombre() {
        assertTrue(persona.getNombre().equals("Jose"));
    }

    @org.junit.Test
    public void getEdad() {
        assertTrue(persona.getEdad() == 23);
    }

    @Test
    public void edadCero() {
        Persona p = new Persona("Laura");
        boolean res = p.setEdad(0);
        assertTrue(!res);
    }

    @org.junit.Test
    public void edadNegativa() {
        Persona p = new Persona("Laura");
        boolean res = p.setEdad(-13);
        assertTrue(!res);
    }

    @Test
    public void nombreVacio() {
        Persona p = new Persona("Laura",23);
        boolean res = p.setNombre("");
        assertTrue(!res);
    }

    @Test
    public void nombreTamano() {
        Persona p = new Persona("Laura",23);
        boolean res = p.setNombre("asdfghjkloi");
        assertTrue(!res);
    }


}