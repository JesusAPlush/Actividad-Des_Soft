package service;
import model.Casting;
import repository.CastingRepository;
import java.util.List;

public class CastingService {
    private CastingRepository repository = new CastingRepository();

    public void agregar(Casting c) {
        repository.create(c);
    }

    public Casting obtener(int id) {
        return repository.read(id);
    }

    public void actualizar(Casting c) {
        repository.update(c);
    }

    public void eliminar(int id) {
        repository.delete(id);
    }

    public List<Casting> listar() { return
            repository.findAll();
    }
}