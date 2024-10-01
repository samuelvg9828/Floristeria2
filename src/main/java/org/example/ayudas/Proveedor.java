package org.example.ayudas;

public class Proveedor {

    private String NIT;
    private String nombre;
    private String representante;

    private String medioTransporte;
    private String locacion;
    private Integer cantidad;
    private Integer valorFlor;
    private Integer calificacion;
    private String usuario;
    private String contraseña;


    public Proveedor() {
    }

    public Proveedor(String NIT, String nombre, String representante, String medioTransporte, String locacion, Integer cantidad, Integer valorFlor, Integer calificacion, String usuario, String contraseña) {
        this.NIT = NIT;
        this.nombre = nombre;
        this.representante = representante;
        this.medioTransporte = medioTransporte;
        this.locacion = locacion;
        this.cantidad = cantidad;
        this.valorFlor = valorFlor;
        this.calificacion = calificacion;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getMedioTransporte() {
        return medioTransporte;
    }

    public void setMedioTransporte(String medioTransporte) {
        this.medioTransporte = medioTransporte;
    }

    public String getLocacion() {
        return locacion;
    }

    public void setLocacion(String locacion) {
        this.locacion = locacion;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getValorFlor() {
        return valorFlor;
    }

    public void setValorFlor(Integer valorFlor) {
        this.valorFlor = valorFlor;
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
        return "Proveedor{" +
                "NIT='" + NIT + '\'' +
                ", nombre='" + nombre + '\'' +
                ", representante='" + representante + '\'' +
                ", medioTransporte='" + medioTransporte + '\'' +
                ", locacion='" + locacion + '\'' +
                ", cantidad=" + cantidad +
                ", valorFlor=" + valorFlor +
                ", calificacion=" + calificacion +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}
