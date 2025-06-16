package test;
import model.Candidato;
import service.CandidatoService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CandidatoServiceTest {
    private CandidatoService service;

    @Before
    public void setUp() {
        service = new CandidatoService();
    }

    @Test
    public void testAgregarYObtener() {
        Candidato c = new Candidato(1, "Laura", "Calle 2", "555");
        service.agregar(c);
        assertEquals("Laura", service.obtener(1).getNombre());
    }
}