package edu.unahur.AmarrasPolimorfismo.ar;

public abstract class Yate {
    protected String nombre;
    protected String dueno;
    protected double manga;
    protected double calado;
    protected double eslora;
    protected int tripulacion;
    protected double peso;

    public Yate(String nombre, String dueno, double manga, double calado, double eslora, int tripulacion, double peso){
        this.nombre = nombre;
        this.dueno = dueno;
        this.manga = manga;
        this.calado = calado;
        this.eslora = eslora;
        this.tripulacion = tripulacion;
        this.peso = peso;
    }

    public double getEslora(){
        return eslora;
    }



}
