package compara;

import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class RecipienteTest {

    private Recipiente recipiente;

    @Before
    public void setUp() throws Exception {
        recipiente = new Recipiente("Fresas",5,15);
    }


    @org.junit.Test
    public void getContenido() {
        assertTrue(recipiente.getContenido().equals("Fresas"));
    }

    @org.junit.Test
    public void setContenido() {
        Recipiente r = new Recipiente("Mango",5,5);
        r.setContenido("Melon");
        assertEquals(r.getContenido(),"Melon");
    }
}