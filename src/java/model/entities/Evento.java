package model.entities;
// Generated 23/01/2014 14:28:10 by Hibernate Tools 3.6.0


import java.util.Date;

/**
 * Evento generated by hbm2java
 */
public class Evento  implements java.io.Serializable {


     private Integer idEvento;
     private Usuario usuario;
     private Publicacion publicacion;
     private String titulo;
     private String descripcion;
     private String contenido;
     private Date fechaSubido;
     private Date fechaInicio;
     private Date fechaFin;

    public Evento() {
    }

	
    public Evento(Usuario usuario) {
        this.usuario = usuario;
    }
    public Evento(Usuario usuario, Publicacion publicacion, String titulo, String descripcion, String contenido, Date fechaSubido, Date fechaInicio, Date fechaFin) {
       this.usuario = usuario;
       this.publicacion = publicacion;
       this.titulo = titulo;
       this.descripcion = descripcion;
       this.contenido = contenido;
       this.fechaSubido = fechaSubido;
       this.fechaInicio = fechaInicio;
       this.fechaFin = fechaFin;
    }
   
    public Integer getIdEvento() {
        return this.idEvento;
    }
    
    public void setIdEvento(Integer idEvento) {
        this.idEvento = idEvento;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public Publicacion getPublicacion() {
        return this.publicacion;
    }
    
    public void setPublicacion(Publicacion publicacion) {
        this.publicacion = publicacion;
    }
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getContenido() {
        return this.contenido;
    }
    
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
    public Date getFechaSubido() {
        return this.fechaSubido;
    }
    
    public void setFechaSubido(Date fechaSubido) {
        this.fechaSubido = fechaSubido;
    }
    public Date getFechaInicio() {
        return this.fechaInicio;
    }
    
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public Date getFechaFin() {
        return this.fechaFin;
    }
    
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }




}


