package org.example.ayudas;

public class Repartidor {

    private String cedula;
    private String nombre;
    private Integer edad;

    private String vehiculo;
    private Integer salario;
    private Integer estratoSocioeconomico;
    private String placaVehiculo;
    private Integer calificacion;
    private String usuario;
    private String contraseña;

    public Repartidor() {
    }

    public Repartidor(String cedula, String nombre, Integer edad, String vehiculo, Integer salario, Integer estratoSocioeconomico, String placaVehiculo, Integer calificacion, String usuario, String contraseña) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.edad = edad;
        this.vehiculo = vehiculo;
        this.salario = salario;
        this.estratoSocioeconomico = estratoSocioeconomico;
        this.placaVehiculo = placaVehiculo;
        this.calificacion = calificacion;
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

    public String getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(String vehiculo) {
        this.vehiculo = vehiculo;
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

    public String getPlacaVehiculo() {
        return placaVehiculo;
    }

    public void setPlacaVehiculo(String placaVehiculo) {
        this.placaVehiculo = placaVehiculo;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
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
        return "Repartidor{" +
                "cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", vehiculo='" + vehiculo + '\'' +
                ", salario=" + salario +
                ", estratoSocioeconomico=" + estratoSocioeconomico +
                ", placaVehiculo='" + placaVehiculo + '\'' +
                ", calificacion=" + calificacion +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}

