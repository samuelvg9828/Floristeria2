package org.example.modelos;

public class Flor {

    private Integer id;
    private String especie;
    private Integer numeroPetalos;
    private String floristeria;
    private String color;
    private Boolean tieneEspinas;
    private Integer cantidadVentas;
    private Boolean esLocal;
    private Integer precio;
    private Boolean enExtincion;


    public Flor() {
    }

    public Flor(Integer id, String especie, Integer numeroPetalos, String floristeria, String color, Boolean tieneEspinas, Integer cantidadVentas, Boolean esLocal, Integer precio, Boolean enExtincion) {
        this.id = id;
        this.especie = especie;
        this.numeroPetalos = numeroPetalos;
        this.floristeria = floristeria;
        this.color = color;
        this.tieneEspinas = tieneEspinas;
        this.cantidadVentas = cantidadVentas;
        this.esLocal = esLocal;
        this.precio = precio;
        this.enExtincion = enExtincion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getNumeroPetalos() {
        return numeroPetalos;
    }

    public void setNumeroPetalos(Integer numeroPetalos) {
        this.numeroPetalos = numeroPetalos;
    }

    public String getFloristeria() {
        return floristeria;
    }

    public void setFloristeria(String floristeria) {
        this.floristeria = floristeria;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getTieneEspinas() {
        return tieneEspinas;
    }

    public void setTieneEspinas(Boolean tieneEspinas) {
        this.tieneEspinas = tieneEspinas;
    }

    public Integer getCantidadVentas() {
        return cantidadVentas;
    }

    public void setCantidadVentas(Integer cantidadVentas) {
        this.cantidadVentas = cantidadVentas;
    }

    public Boolean getEsLocal() {
        return esLocal;
    }

    public void setEsLocal(Boolean esLocal) {
        this.esLocal = esLocal;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Boolean getEnExtincion() {
        return enExtincion;
    }

    public void setEnExtincion(Boolean enExtincion) {
        this.enExtincion = enExtincion;
    }

    @Override
    public String toString() {
        return "Flor{" +
                "id=" + id +
                ", especie='" + especie + '\'' +
                ", numeroPetalos=" + numeroPetalos +
                ", floristeria='" + floristeria + '\'' +
                ", color='" + color + '\'' +
                ", tieneEspinas=" + tieneEspinas +
                ", cantidadVentas=" + cantidadVentas +
                ", esLocal=" + esLocal +
                ", precio=" + precio +
                ", enExtincion=" + enExtincion +
                '}';
    }
}
