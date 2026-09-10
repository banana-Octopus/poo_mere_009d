package dev.rampmaster;

public class Seccion {
    private String codigo;
    private int anho;
    private int semestre;
    private String jornada;
    private Asignatura asignatura;
    private boolean activa;
    private int cupoMaximo;

    public Seccion(String codigo, int anho, int semestre, String jornada) {
        this.codigo = codigo;
        this.anho = anho;
        this.semestre = semestre;
        this.jornada = jornada;
        this.activa = true; // Por defecto, la sección está activa al crearla
        this.cupoMaximo = 30; // Por defecto, el cupo máximo es
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public String getJornada() {
        return jornada;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
