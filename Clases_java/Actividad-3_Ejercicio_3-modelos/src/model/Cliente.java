package model;
// ... Clase Cliente (misma definición anterior) ...
public class Cliente {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String personaDeContacto;
    private String tipoDeActividad;
    public Cliente(int id, String nombre, String direccion, String telefono, String personaDeContacto, String tipoDeActividad) {
        this.id = id; this.nombre = nombre; this.direccion = direccion; this.telefono = telefono;
        this.personaDeContacto = personaDeContacto; this.tipoDeActividad = tipoDeActividad;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPersonaDeContacto() {
        return personaDeContacto;
    }

    public void setPersonaDeContacto(String personaDeContacto) {
        this.personaDeContacto = personaDeContacto;
    }

    public String getTipoDeActividad() {
        return tipoDeActividad;
    }

    public void setTipoDeActividad(String tipoDeActividad) {
        this.tipoDeActividad = tipoDeActividad;
    }
}