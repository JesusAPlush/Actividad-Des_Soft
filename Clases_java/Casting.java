public class Casting {
    private int id;
    private String nombre;
    private String descripcion;
    private String fechaDeContratacion;

    private Cliente cliente;
    private AgenteCasting agenteCasting;
    private Candidato candidato;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(String fechaDeContratacion) {
        this.fechaDeContratacion = fechaDeContratacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public AgenteCasting getAgenteCasting() {
        return agenteCasting;
    }

    public void setAgenteCasting(AgenteCasting agenteCasting) {
        this.agenteCasting = agenteCasting;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
