package controller;
import model.Candidato;
import service.CandidatoService;
import java.util.List;

public class CandidatoController {
    private CandidatoService service = new CandidatoService();

    public void crear(Candidato c) {
        service.agregar(c);
    }

    public Candidato consultar(int id) {
        return service.obtener(id);
    }

    public void actualizar(Candidato c) {
        service.actualizar(c);
    }

    public void eliminar(int id) {
        service.eliminar(id);
    }

    public List<Candidato> listar() {
        return service.listar();
    }
}