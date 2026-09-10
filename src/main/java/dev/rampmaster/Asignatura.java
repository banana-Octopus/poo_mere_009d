package dev.rampmaster;

import java.util.HashSet;

public class Asignatura {
    // Atributos de identificación
    private String codigo;
    private HashSet<Seccion> secciones;
    // Atributos de estado
    private boolean activa;

    // Constructor
    public Asignatura(String codigo) {
        this.codigo = codigo;
        this.secciones = new HashSet<>();
        this.activa = true; // Por defecto, la asignatura está activa al crearla
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public HashSet<Seccion> getSecciones() {
        return secciones;
    }

    public void setSecciones(HashSet<Seccion> secciones) {
        this.secciones = secciones;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    // Metodo para compartamiento
    public void agregarSeccion(Seccion seccion) {
        this.secciones.add(seccion);
        seccion.setAsignatura(this); // Establece la relación bidireccional
    }
}
