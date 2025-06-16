package controller;
import model.Casting;
import service.CastingService;
import java.util.List;

public class CastingController {
    private CastingService service = new CastingService();

    public void crear(Casting c) {
        service.agregar(c);
    }
    public Casting consultar(int id) {
        return service.obtener(id);
    }
    public void actualizar(Casting c) {
        service.actualizar(c);
    }
    public void eliminar(int id) {
        service.eliminar(id);
    }
    public List<Casting> listar() {
        return service.listar();
    }
}