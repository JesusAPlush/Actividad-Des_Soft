package service;
import model.Cliente;
import repository.ClienteRepository;
import java.util.List;

public class ClienteService {
    private ClienteRepository repository = new ClienteRepository();

    public void agregar(Cliente c) {
        repository.create(c);
    }

    public Cliente obtener(int id) {
        return repository.read(id);
    }

    public void actualizar(Cliente c) {
        repository.update(c);
    }

    public void eliminar(int id) {
        repository.delete(id);
    }

    public List<Cliente> listar() {
        return repository.findAll();
    }
}