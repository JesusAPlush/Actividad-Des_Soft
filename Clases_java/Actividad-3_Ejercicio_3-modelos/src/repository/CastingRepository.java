package repository;
import model.Casting;
import java.util.*;

public class CastingRepository {
    private Map<Integer, Casting> db = new HashMap<>();

    public void create(Casting casting) {
        db.put(casting.getId(), casting);
    }

    public Casting read(int id) {
        return db.get(id);
    }

    public void update(Casting casting) {
        db.put(casting.getId(), casting);
    }

    public void delete(int id) {
        db.remove(id);
    }

    public List<Casting> findAll() {
        return new ArrayList<>(db.values());
    }
}