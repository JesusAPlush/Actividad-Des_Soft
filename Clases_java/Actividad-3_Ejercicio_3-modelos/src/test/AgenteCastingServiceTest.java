package test;
import model.AgenteCasting;
import service.AgenteCastingService;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class AgenteCastingServiceTest {
    private AgenteCastingService service;

    @Before
    public void setUp() {
        service = new AgenteCastingService();
    }

    @Test
    public void testAgregarYObtenerAgente() {
        AgenteCasting agente = new AgenteCasting(1, "Juan", "Calle 123", "305-3710582");
        service.agregarAgente(agente);
        AgenteCasting obtenido = service.obtenerAgente(1);
        assertEquals("Juan", obtenido.getNombre());
    }

    @Test
    public void testActualizarAgente() {
        AgenteCasting agente = new AgenteCasting(2, "Ana", "Calle 456", "322-4322241");
        service.agregarAgente(agente);
        agente.setNombre("Ana María");
        service.actualizarAgente(agente);
        assertEquals("Ana María", service.obtenerAgente(2).getNombre());
    }

    @Test
    public void testEliminarAgente() {
        AgenteCasting agente = new AgenteCasting(3, "Luis", "Calle 789", "305-3667445");
        service.agregarAgente(agente);
        service.eliminarAgente(3);
        assertNull(service.obtenerAgente(3));
    }
}