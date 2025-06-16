package controller;
import model.Cliente;
import service.ClienteService;
import java.util.List;

public class ClienteController {
    private ClienteService service = new ClienteService();

    public void crear(Cliente c) {
        service.agregar(c);
    }

    public Cliente consultar(int id) {
        return service.obtener(id);
    }

    public void actualizar(Cliente c) {
        service.actualizar(c);
    }

    public void eliminar(int id) {
        service.eliminar(id);
    }

    public List<Cliente> listar() {
        return service.listar();
    }
}