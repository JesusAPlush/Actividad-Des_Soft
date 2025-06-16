package repository;
import model.AgenteCasting;
import java.util.*;

public class AgenteCastingRepository {
    private Map<Integer, AgenteCasting> db = new HashMap<>();

    public void create(AgenteCasting agente) {
        db.put(agente.getId(), agente);
    }

    public AgenteCasting read(int id) {
        return db.get(id);
    }

    public void update(AgenteCasting agente) {
        db.put(agente.getId(), agente);
    }

    public void delete(int id) {
        db.remove(id);
    }

    public List<AgenteCasting> findAll() {
        return new ArrayList<>(db.values());
    }
}