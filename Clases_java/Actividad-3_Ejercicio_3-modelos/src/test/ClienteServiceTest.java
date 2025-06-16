package test;
import model.Cliente;
import service.ClienteService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ClienteServiceTest {
    private ClienteService service;

    @Before
    public void setUp() {
        service = new ClienteService();
    }

    @Test
    public void testAgregarYObtener() {
        Cliente c = new Cliente(1, "Sony", "Av 1", "123", "Carlos", "Cine");
        service.agregar(c);
        assertEquals("Sony", service.obtener(1).getNombre());
    }
}