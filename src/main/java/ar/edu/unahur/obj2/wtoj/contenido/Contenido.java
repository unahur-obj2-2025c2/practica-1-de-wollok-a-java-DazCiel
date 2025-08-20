package ar.edu.unahur.obj2.wtoj.contenido;

public abstract class Contenido {
    private final String titulo; //Solo tiene geter, no seter
    private Double costoBase;

    public Contenido(String titulo, Double costoBase) {
        this.titulo = titulo;
        this.costoBase = costoBase;
    }

    public String getTitulo() {
        return titulo;
    }

    public Double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(Double costoBase) {
        this.costoBase = costoBase;
    }
    
    //template method
    public Double Costo() {
        return costoBase + this.doCosto();
    }

    protected abstract Double doCosto();
}
