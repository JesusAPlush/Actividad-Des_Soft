package repository;
import model.Cliente;
import java.util.*;

public class ClienteRepository {
    private Map<Integer, Cliente> db = new HashMap<>();

    public void create(Cliente cliente) {
        db.put(cliente.getId(), cliente);
    }

    public Cliente read(int id) {
        return db.get(id);
    }

    public void update(Cliente cliente) {
        db.put(cliente.getId(), cliente);
    }

    public void delete(int id) {
        db.remove(id);
    }

    public List<Cliente> findAll() {
        return new ArrayList<>(db.values());
    }
}