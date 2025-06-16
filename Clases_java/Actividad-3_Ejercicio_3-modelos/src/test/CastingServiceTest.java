package test;
import model.Casting;
import service.CastingService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CastingServiceTest {
    private CastingService service;

    @Before
    public void setUp() {
        service = new CastingService();
    }

    @Test
    public void testAgregarYObtener() {
        Casting c = new Casting(1, "Comercial", "Descripción");
        service.agregar(c);
        assertEquals("Comercial", service.obtener(1).getNombre());
    }
}