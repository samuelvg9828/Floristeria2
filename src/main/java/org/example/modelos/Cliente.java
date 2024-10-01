package org.example.modelos;

public class Cliente {

    private String cedula;
    private String nombre;
    private Integer edad;

    private Boolean tieneBono;
    private Integer salario;
    private Integer estratoSocioeconomico;
    private String lugarTrabajo;
    private Boolean esRecurrente;
    private String usuario;
    private String contraseña;

    public Cliente() {
    }

    public Cliente(String cedula, String nombre, Integer edad, Boolean tieneBono, Integer salario, Integer estratoSocioeconomico, String lugarTrabajo, Boolean esRecurrente, String usuario, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.tieneBono = tieneBono;
        this.salario = salario;
        this.estratoSocioeconomico = estratoSocioeconomico;
        this.lugarTrabajo = lugarTrabajo;
        this.esRecurrente = esRecurrente;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Boolean getTieneBono() {
        return tieneBono;
    }

    public void setTieneBono(Boolean tieneBono) {
        this.tieneBono = tieneBono;
    }

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }

    public Integer getEstratoSocioeconomico() {
        return estratoSocioeconomico;
    }

    public void setEstratoSocioeconomico(Integer estratoSocioeconomico) {
        this.estratoSocioeconomico = estratoSocioeconomico;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String lugarTrabajo) {
        this.lugarTrabajo = lugarTrabajo;
    }

    public Boolean getEsRecurrente() {
        return esRecurrente;
    }

    public void setEsRecurrente(Boolean esRecurrente) {
        this.esRecurrente = esRecurrente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", tieneBono=" + tieneBono +
                ", salario=" + salario +
                ", estratoSocioeconomico=" + estratoSocioeconomico +
                ", lugarTrabajo='" + lugarTrabajo + '\'' +
                ", esRecurrente=" + esRecurrente +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
