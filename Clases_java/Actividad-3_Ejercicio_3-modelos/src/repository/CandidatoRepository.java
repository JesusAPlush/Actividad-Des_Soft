package repository;
import model.Candidato;
import java.util.*;

public class CandidatoRepository {
    private Map<Integer, Candidato> db = new HashMap<>();

    public void create(Candidato candidato) {
        db.put(candidato.getId(), candidato);
    }

    public Candidato read(int id) {
        return db.get(id);
    }

    public void update(Candidato candidato) {
        db.put(candidato.getId(), candidato);
    }

    public void delete(int id) {
        db.remove(id);
    }

    public List<Candidato> findAll() {
        return new ArrayList<>(db.values());
    }
}