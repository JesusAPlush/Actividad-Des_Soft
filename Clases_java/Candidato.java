public class Candidato {
    private int id;
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaDeNacimiento;
    private String fotografia;
    private String provincia;
    private String sexo;
    private double altura;
    private String colorDePelo;
    private String colorDeOjos;
    private String especialidad;
    private String experiencia;

    public Candidato(int id, String nombre, String direccion, String telefono, String fechaDeNacimiento, String fotografia, String provincia, String sexo, double altura, 
    String colorDePelo, String colorDeOjos, String especialidad, String experiencia) {
    this.id = id;
    this.nombre = nombre;
    this.direccion = direccion;
    this.telefono = telefono;
    this.fechaDeNacimiento = fechaDeNacimiento;
    this.fotografia = fotografia;
    this.provincia = provincia;
    this.sexo = sexo;
    this.altura = altura;
    this.colorDePelo = colorDePelo;
    this.colorDeOjos = colorDeOjos;
    this.especialidad = especialidad;
    this.experiencia = experiencia;
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

    public String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getColorDePelo() {
        return colorDePelo;
    }

    public void setColorDePelo(String colorDePelo) {
        this.colorDePelo = colorDePelo;
    }

    public String getColorDeOjos() {
        return colorDeOjos;
    }

    public void setColorDeOjos(String colorDeOjos) {
        this.colorDeOjos = colorDeOjos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
}
