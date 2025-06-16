package controller;
import model.AgenteCasting;
import service.AgenteCastingService;
import java.util.List;

public class AgenteCastingController {
    private AgenteCastingService service = new AgenteCastingService();

    public void crear(AgenteCasting agente) {
        service.agregarAgente(agente);
    }

    public AgenteCasting consultar(int id) {
        return service.obtenerAgente(id);
    }

    public void actualizar(AgenteCasting agente) {
        service.actualizarAgente(agente);
    }

    public void eliminar(int id) {
        service.eliminarAgente(id);
    }

    public List<AgenteCasting> listar() {
        return service.listarAgentes();
    }
}