package service;
import model.AgenteCasting;
import repository.AgenteCastingRepository;
import java.util.List;

public class AgenteCastingService {
    private AgenteCastingRepository repository = new AgenteCastingRepository();

    public void agregarAgente(AgenteCasting agente) {
        repository.create(agente);
    }

    public AgenteCasting obtenerAgente(int id) {
        return repository.read(id);
    }

    public void actualizarAgente(AgenteCasting agente) {
        repository.update(agente);
    }

    public void eliminarAgente(int id) {
        repository.delete(id);
    }

    public List<AgenteCasting> listarAgentes() {
        return repository.findAll();
    }
}