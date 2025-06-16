package service;
import model.Candidato;
import repository.CandidatoRepository;
import java.util.List;

public class CandidatoService {
    private CandidatoRepository repository = new CandidatoRepository();

    public void agregar(Candidato c) {
        repository.create(c);
    }

    public Candidato obtener(int id) {
        return repository.read(id);
    }

    public void actualizar(Candidato c) {
        repository.update(c);
    }

    public void eliminar(int id) {
        repository.delete(id);
    }

    public List<Candidato> listar() {
        return repository.findAll();
    }
}